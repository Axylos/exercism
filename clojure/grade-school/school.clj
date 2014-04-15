(ns school)

(defn add [db student grade]
  (merge-with concat db { grade  [student] }))
  

(def db {})
(print (-> db
    (add "Jeffrey" 5)
    (add "Drake" 6)
    (add "Mandy" 6)))

  ;;(def db (merge-with concat  db {grade [student]})))



(defn grade [db grade] 
  (or (db grade) []))

(defn sorted [db]
  (zipmap (keys db) (map sort (vals db))))

