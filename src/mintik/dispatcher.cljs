(ns mintik.dispatcher
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async :as async :refer [<!]]
            [mintik.mutator :as m]
            [mintik.data :as d]
            [mintik.view :as v]))

(go (while true
  (handle-events (<! d/channel))))

(defn handle-events [payload]
  (case (:type payload)
    :inc (m/inc!))
  (v/render @d/data))

