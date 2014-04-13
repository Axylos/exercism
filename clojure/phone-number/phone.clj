(ns phone
(:require [clojure.string :as string]))

(defn number [number]
  
  (let [nums (str (string/join(re-seq #"\d" number)))]

    (if (and (= (count nums) 11) (= (first nums) \1))
        (subs nums 1)

      (do (if (not= (count nums) 10)
            (string/join (map (fn [x] "0") (into [] (range 10))))
        nums)))))

(defn area-code [area]
  (subs area 0 3))

(defn pretty-print [numb]
  (let [nums (number numb)]
    (format "(%s) %s-%s"
            (str (subs nums 0 3))
            (str (subs nums 3 6))
            (str (subs nums 6 10)))))


