(ns dna)
"it counts nucleotides on a string"
(defn dna/count [nucleo string]

  (if (re-matches #"([^ACGTU])" (str nucleo))
    (throw (Exception. "invalid nucleotide"))
  )

  (or (get (frequencies string) nucleo) 0)

)

(defn dna/nucleotide-counts [stuff]
  
  (let [nucs (hash-map \A 0 \C 0 \G 0 \T 0 )]
  (merge nucs (frequencies stuff)))
  
)



