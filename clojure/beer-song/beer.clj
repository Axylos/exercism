(ns beer)

(defn firstBottle [bottles] 
  (if (> bottles 1) 
    (format "%d bottles" bottles)
    "1 bottle"))

(defn secondBottle [bottles]
   (if (> bottles 2)
     (format "%d bottles" (- bottles 1))
     (if (= bottles 2)
       "1 bottle"
       "no more bottles")))

(defn verse [bottles]
  (let [bots (list (firstBottle bottles) (secondBottle bottles))]
  (str (format "%s of beer on the wall, %s of beer.\nTake %s down and pass it around, %s of beer on the wall.\n" 
                   (first bots)
                   (first bots)
                   (str (if (> bottles 1)
                          "one"
                          "it"))
                   (last bots)))))

(defn makeVerses [start stop]
  (let [vs (into [] (reverse (range stop (+ start 1))))]
  (clojure.string/join "\n" (map verse vs))))

(defn sing 
  ([start] 
   (format"%s\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n" 
                  (makeVerses start 1)))
  ([start stop] (makeVerses start stop)))

