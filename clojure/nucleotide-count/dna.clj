(ns dna)

(defn dna/count [nucleo string]

  (if (re-matches #"([^ACGTU])" (str nucleo))
    (throw (Exception. "invalid nucleotide"))
  )
    
  (def letters (seq string))
  (clojure.core/count (filter (fn [x] (= nucleo x)) letters))

)

(defn dna/nucleotide-counts [stuff]
  
  (def nucs (hash-map \A 0 \C 0 \G 0 \T 0 ))
  (merge nucs (frequencies stuff))
  
)



