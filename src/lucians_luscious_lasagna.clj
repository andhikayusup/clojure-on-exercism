(ns lucians-luscious-lasagna)

(def expected-time 40)

(defn remaining-time [time]
   (- expected-time time))

(defn prep-time [lasagna-layer]
    (* 2 lasagna-layer))

(defn total-time [lasagna-layer oven-time]
    (+ (prep-time lasagna-layer) oven-time))