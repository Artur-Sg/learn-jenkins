(ns ops-school.config
  (:refer-clojure :exclude [read])
  (:require [clojure.java.io :as io]
            [clojure.edn :as edn]))

(def ^:private settings-file "SETTINGS_FILE")
(def ^:private defaults-resource "defaults.edn")

(defn read
  []
  (-> settings-file
      (System/getenv)
      (or (io/resource defaults-resource))
      (slurp)
      (edn/read-string)))
