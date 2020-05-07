(ns ops-school.http-server
  (:require [muuntaja.middleware :as mw]
            [ring.adapter.jetty :refer [run-jetty]]))

(defn- handler
  [_]
  {:status 200
   :body {:ping "pong"}})

(defn start
  [port]
  (-> handler
      (mw/wrap-format)
      (run-jetty {:port port})))
