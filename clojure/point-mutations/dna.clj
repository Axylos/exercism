(ns dna)

(defn hamming-distance [a b]

  (defn differ [a b] (if (not= a b) a))
  (def diffs (map differ a b))
  (count (remove nil? diffs))
 
)
