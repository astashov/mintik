(ns mintik.view
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async :as async :refer [>!]]
            [quiescent :as q :include-macros true]
            [quiescent.dom :as dom]
            [mintik.data :as d]))

(q/defcomponent Content [data]
  (dom/div {}
    (:count data)
    (dom/button {:onClick (fn [_]
                            (go (>! d/channel {:type :inc})))}
                "Inc")))

(defn render [data]
  (q/render (Content data) (.-body js/document)))
