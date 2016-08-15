(defproject ragtime/ragtime.jdbc "0.6.3"
  :description "Ragtime migrations for JDBC"
  :url "https://github.com/weavejester/ragtime"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.5.8"]
                 [ragtime/ragtime.core "0.6.3"]
                 [resauce "0.1.0"]]
  :profiles
  {:dev {:dependencies [[com.h2database/h2 "1.3.160"]]}})
