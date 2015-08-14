(ns commos.delta.cache
  (:require [commos.delta :as delta]
            [commos.service :as service]))

(defn sum-cache
  "Caches the accumulated sum.  Always serves the sum as an :is
  delta."
  [service]
  (service/cacher service
                  (fn [cache d]
                    (update (or cache [:is [] nil]) 2 delta/add d))
                  :forward :cache))

(defn hybrid-cache
  "Serves the sum to requests at cached specs, continues forwarding
  untransformed deltas."
  [service]
  (service/cacher service
                  (fn [cache d]
                    (update (or cache [:is [] nil]) 2 delta/add d))))
