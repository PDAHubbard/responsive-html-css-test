(ns homepage-clojure.core)

(defn handle-click []
  (js/alert "Hello!"))

(def clickable (.getElementById js/document "clickable"))
(.addEventListener clickable "click" handle-click)
