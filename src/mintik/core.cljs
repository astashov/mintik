(ns mintik.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async :as async :refer [<!]]
            [mintik.data :as d]
            [mintik.view :as v]))

(v/render @d/data)
