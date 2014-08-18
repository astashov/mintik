(defproject mintik "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [quiescent "0.1.4"]
                 [com.facebook/react "0.11.1"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :jvm-opts ["-Xmx1G"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src/mintik"]
              :compiler {
                :output-to "mintik.js"
                :preamble ["react/react.min.js"]
                :optimizations :whitespace}}]})
