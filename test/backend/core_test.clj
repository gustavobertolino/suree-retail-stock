(ns backend.core_test
  (:require [clojure.string :as st]
            [clojure.test :as t]
            [backend.core :as core]
            [libtools.date_time_util :as dt]))

(t/deftest test_core_message
  (t/testing "it should contain the substring in message"
    (t/is (true? (st/includes? (with-out-str (core/-main)) "The product is in stock")))))

(t/deftest test_core_datetime
  (t/testing "it should contain current time now"
    (t/is (true? (st/includes? (with-out-str (core/-main)) (dt/time-str (dt/now)))))))
