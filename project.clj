(defproject simple-http "0.1.0-SNAPSHOT"
  :author "Bryan Yunis"
  :description "A simple http server"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [http-kit "2.2.0"]
                 [clj-time "0.14.0"]]
  :main simple-http.core
  :repl-options {:init-ns simple-http.core})