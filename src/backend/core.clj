(ns backend.core
  (:require [libtools.date_time_util :as dt]))

(defn -main [] 
  (println "The product is in stock! Despatch time is" 
    (dt/time-str (dt/now))))
