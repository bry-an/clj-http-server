(ns simple-http.core
  (:require [ring.adapter.jetty :as ring-jetty]
            [reitit.ring :as ring]
            [muuntaja.core :as m]
            [reitit.ring.middleware.muuntaja :as muuntaja]))
            

(use 'ring.adapter.jetty)

(defn string-handler [_]
  {:status 200
   :body "hey cowboy"})

(def app
  (ring/ring-handler
    (ring/router
      ["/"
       ["" {:get string-handler}]
       ["/math"
        {:post string-handler}]]
      {:data {:muuntaja m/instance
              :middleware [muuntaja/format-middleware]}})))
                           
(defn start []
  (ring-jetty/run-jetty app {:port 3000
                             :join? false}))

(defn -main
  [& args]
  (start))
  
