(ns beer)

(defn line [bottles]

  (def firstBottle 
     (if (> bottles 1)
       (format "%d bottles" bottles)
       "1 bottle"
     )
  )

  (def bot (- bottles 1))
  (def secondBottle
    (if (> bot 1)
      (format "%d bottles" bot)
      
      (if (= bot 1)
        "1 bottle"
        "no more bottles")
    )
    
  )

  (list (str firstBottle) (str secondBottle))
)

(defn verse [bottles]
  

  (def bots (line bottles))

  (def ver (format "%s of beer on the wall, %s of beer.\nTake %s down and pass it around, %s of beer on the wall.\n" 
                   (first bots)
                   (first bots)
                   (str (if (> bottles 1)
                          "one"
                          "it"
                        ))
                   (last bots)
                   ))

  (str ver)
  )

(defn makeVerses [start stop]
  (def vs (into [] (reverse (range stop (+ start 1)))))
  (clojure.string/join "\n" (map verse vs) )
  )


(defn sing 
            ([start] (def core (makeVerses start 1))
             (format"%s\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n" core))
            ([start stop] (makeVerses start stop)))

