(ns word-count)

(defn word-count [input]
  
  (def ans {})

  (def words (map clojure.string/lower-case (re-seq #"\w+" input)))
  (frequencies words)
  
  
)

(word-count "one two")
