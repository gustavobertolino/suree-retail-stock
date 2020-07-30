(ns libtools.date_time_util
  (:require [clj-time.core :as t]
            [clj-time.format :as f]))


(defn now "Return current instant"
  [] (t/now))

(defn time-str "Return datetime formatted in string"
  [datetime]
  (f/unparse 
    (f/with-zone (f/formatter "hh:mm:aa") (t/default-time-zone)) 
      datetime))
