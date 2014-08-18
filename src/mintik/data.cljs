(ns mintik.data
  (:require [cljs.core.async :refer [chan]]))

(def channel (chan))

(def initial-data
  {:count 0})

(defonce data
  (atom initial-data))
