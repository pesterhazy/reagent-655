(ns foo.main
  (:require [reagent.core :as r]))

(enable-console-print!)

;; (defonce my-atom (atom nil))

;; (let [a (r/wrap 15 swap! my-atom assoc :foo)]
;;   (reset! a 20)
;;   (prn [:a @a]))

(js/console.log (apply (r/partial + 1) [1 1]))
