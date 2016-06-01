(defproject fullcontact/full.metrics "0.10.0-SNAPSHOT"
  :description "Clojure application metrics and monitoring sugar"
  :url "https://github.com/fullcontact/full.metrics"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :deploy-repositories [["releases" {:url "https://clojars.org/repo/" :creds :gpg}]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [riemann-clojure-client "0.4.1" :exclusions [org.clojure/tools.logging
                                                               org.slf4j/slf4j-api]]
                 [com.climate/clj-newrelic "0.2.1"]
                 [fullcontact/full.async "0.9.0"]
                 [fullcontact/full.http "0.9.0"]
                 [fullcontact/full.core "0.9.0"]]
  :aot [full.metrics]  ; clojure new relic extension doesn't work when AOT'ed.
  :plugins [[lein-midje "3.1.3"]]
  :profiles {:dev {:dependencies [[midje "1.7.0"]]}})
