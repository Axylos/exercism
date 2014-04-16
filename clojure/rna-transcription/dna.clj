(ns dna)
(use '[clojure.string :only (split join)])

(defn to-rna [input]
  (let [convert (hash-map "G" "C"
                         "C" "G"
                         "T" "A"
                         "A" "U")]

  (assert (= nil (re-find #"([^AGCT])" input)))

  (join (map convert (split input #"")))))



