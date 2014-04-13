(ns dna)

(defn to-rna [input]
  (let [convert (hash-map "G" "C"
                         "C" "G"
                         "T" "A"
                         "A" "U")]

  (let [illegal (re-find #"([^AGCT])" input)]
  (assert (= nil illegal))

  (let [lets (clojure.string/split input #"")]
  (clojure.string/join (map convert lets))))))



