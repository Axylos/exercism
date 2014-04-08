(ns bob)

(defn response-for [input]
  
  (def sure (str "Sure."))
  (def whatever (str "Whatever."))
  (def chill (str "Woah, chill out!"))
  (def upper (clojure.string/upper-case input))
  (def special (re-find #"([\$\^\%\#\@])" input))
  (def question (re-find #"\?$" input))
  (def wordle (re-find #"([a-zA-Z])" input))
  (def fine (str "Fine. Be that way!"))
  (def any (re-find #"\S+" input))

  (def letters (re-seq #"([a-zA-Z])" input))
  (if (not= nil letters)
    (def caps (clojure.string/join (clojure.string/upper-case letters)))
    (def caps nil))

  (def nume (re-find #"\d+" input))


  (def output
    (cond
      (and (not= nil nume)(not= nil caps)) chill
      (= nil any ) fine
      (not= nil special) chill
      (and (= nil question)(not= nil nume)) whatever
      (and (not= nil wordle)(= upper input)) chill
      (not= nil question) sure
      :else whatever)
    )

  (str output)

)


