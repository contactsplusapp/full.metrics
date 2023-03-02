(defproject fullcontact/full.metrics "0.13.1"
  :description "Clojure application metrics and monitoring sugar"
  :url "https://github.com/contactsplusapp/full.metrics"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :repositories [["fullcontact" {:url "https://contactsplus.jfrog.io/artifactory/repo"}]
                 ["releases" {:url "https://contactsplus.jfrog.io/artifactory/libs-release-local"}]
                 ["snapshots" {:url "https://contactsplus.jfrog.io/artifactory/libs-snapshot-local"}]]
  :deploy-repositories [["releases" {:url "https://contactsplus.jfrog.io/artifactory/libs-release-local" :sign-releases false}]
                        ["snapshots" {:url "https://contactsplus.jfrog.io/artifactory/libs-snapshot-local" :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.google.protobuf/protobuf-java "3.1.0"]
                 [clj-statsd "0.4.0"]
                 [com.climate/clj-newrelic "0.2.1"]
                 [fullcontact/full.async "1.1.1"]
                 [fullcontact/full.core "1.1.3" :exclusions [org.clojure/clojurescript]]]
  :plugins [[lein-midje "3.2.2"]]
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "--no-sign"]
                  ["deploy"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]]
  :profiles {:dev {:dependencies [[midje "1.9.9"]]}})
