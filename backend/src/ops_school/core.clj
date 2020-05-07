(ns ops-school.core
  (:require [ops-school.config]
            [ops-school.http-server :as server])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (server/start 3000))
