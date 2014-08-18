(ns mintik.dispatcher
  (:require [mintik.mutator :as m]
            [mintik.data :as d]
            [mintik.view :as v]))

(defn handle-events [payload]
  (case (:type payload)
    :inc (m/inc!))
  (v/render @d/data))

