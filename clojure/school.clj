(ns school)

(let [students {}]
(defn add [student]
  (merge-with concat student students)))

(def grade)
