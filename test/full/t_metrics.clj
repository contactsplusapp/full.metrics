(ns full.t-metrics
  (:require [midje.sweet :refer :all]
            [full.metrics :refer :all]))

(facts
  "Test timeit body evaluated with no configuration."
  (fact (timeit "k" (inc 0)) => 1))
