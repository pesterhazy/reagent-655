(ns foo.main
  (:require [reagent.core :as r]))

(js/console.log (apply (r/partial + 1) [1 1]))
