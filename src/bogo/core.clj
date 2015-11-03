(ns bogo.core
  (:gen-class))


(defn in-order?
	[order-op xs]
	(or (empty? xs)
		(apply order-op xs)))

(defn bogosort
	[order-op xs]
	(if (in-order? order-op xs) (println xs)
		(recur order-op (shuffle xs))))

(def numbers (reverse (range 0 50)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (time (bogosort < numbers)))
