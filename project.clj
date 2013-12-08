(defproject guestbook "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [
                 [org.clojure/java.jdbc "0.2.3"] [org.xerial/sqlite-jdbc "3.7.2"]
                 [org.clojure/clojurescript "0.0-2030"]
                 [org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6" :exclusions [[org.clojure/tools.reader]]]
                 [hiccup "1.0.4"]
                 [ring-server "0.3.1"]]
  :plugins [[lein-ring "0.8.8"]]
  :ring {:handler guestbook.handler/app
         :init guestbook.handler/init
         :destroy guestbook.handler/destroy}
  ;:aot :all
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.2.1"]]}})
