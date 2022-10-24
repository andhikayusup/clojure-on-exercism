(ns lucians-luscious-lasagna-test
  (:require [clojure.test :refer [deftest is]]
            lucians-luscious-lasagna))

(deftest lucians-luscious-lasagna
  (is (= 10 (lucians-luscious-lasagna/remaining-time 30)))
  (is (= 4 (lucians-luscious-lasagna/prep-time 2)))
  (is (= 34 (lucians-luscious-lasagna/total-time 2 30))))