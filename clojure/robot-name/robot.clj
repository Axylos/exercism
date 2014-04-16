(ns robot)

(defn robot [] (atom '())) 

(defn robot-name [n]
  (if (empty? @n)
         (swap! n (fn [n] 
         (clojure.string/join "" 
         (concat 
           (map (fn [x] (rand-nth '(\A \B))) (range 1 3))
           (map (fn [x] (rand-int 10)) (range 1 4))))))

    @n))

(defn reset-name [name] 
  (swap! name (fn [n] '())))


