(ns issues-dashboard.core
  (:use [compojure.core]
        [ring.adapter.jetty]
        [ring.middleware.params :only [wrap-params]]
        [ring.middleware.json-params])
  (:require [compojure.handler :as handler]
            [compojure.route :as route])
  (:gen-class))

(defroutes main-routes
  (GET "/" [] "Nothing to see yet!"))

(def app
  (handler/site (wrap-json-params main-routes)))

(defn -main [& args]
	(let [port (read-string (get (System/getenv) "PORT" "8080"))]
    (run-jetty app {:port port})))
