(ns mintik.mutator
  (:require [mintik.data :as d]))

(defn inc! []
  (swap! d/data update-in [:count] inc))
