(ns word-count)

(defn counter [letters]
  (map clojure.string/lower-case (re-seq #"\w+" letters)))

(defn word-count [input]
  (frequencies (counter input)))

