(defproject issues-dashboard "1.0.0-SNAPSHOT"
  :description "A Restful web app which shows a useful summary of ZenDesk information"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/data.json "0.1.2"]
                 [clj-http "0.4.3"]
                 [compojure "1.1.0"]
                 [ring-json-params "0.1.3"]
                 [ring/ring-jetty-adapter "1.1.0"]]
  :dev-dependencies [[lein-ring "0.7.1"]
                     [ring-mock "0.1.2"]]
  :main issues-dashboard.core
  :ring {:handler issues-dashboard.core/app})