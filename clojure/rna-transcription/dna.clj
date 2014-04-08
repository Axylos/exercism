(ns dna)

(defn to-rna [input]
  (def convert (hash-map "G" "C"
                         "C" "G"
                         "T" "A"
                         "A" "U"))

  (def illegal (re-find #"([^AGCT])" input))
  (assert (= nil illegal))

  (def lets (clojure.string/split input #""))
  (clojure.string/join (map convert lets))

)

