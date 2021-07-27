(ns simple-http.core
  (:require [org.httpkit.server :refer [run-server]]
            [clj-time.core :as t]))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body    (str (t/time-now))})

(defn -main [& args]
  (run-server app {:port 8081})
  (println "Server running at 8081"))
