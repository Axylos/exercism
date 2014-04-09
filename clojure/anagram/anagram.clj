(ns anagram)

(defn anagrams-for [word candidates] 
  

  (def words (keep #(if (not= word % )% )candidates))
  (def base (sort (clojure.string/split (clojure.string/lower-case word) #"")))
    
  (defn ana? [word]
    (def testWord (clojure.string/split (clojure.string/lower-case word) #""))
    (= (sort testWord) base)
  )

  (def anags (keep #(if (ana? % ) % ) words) )

  (if (> 1 (count anags))
    []
    (into [] anags)
  )
  
)


