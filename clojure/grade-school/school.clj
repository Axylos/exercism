(ns school)

(defn add [db student grade]
  (merge-with concat db { grade  [student] }))

(defn grade [db grade] 
  (db grade []))

(defn sorted [db]
  (zipmap (keys db) (map sort (vals db))))

