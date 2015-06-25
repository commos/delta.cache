(defproject org.commos/delta.cache "0.1.0"
  :description "Async commos.delta caching facilities"
  :url "http://github.com/commos/delta.cache"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-RC2"]
                 
                 [org.commos/service "0.1.0"]
                 [org.commos/delta "0.3.0"]]
  :source-paths ["src/cljc"]
  :profiles {:dev {:dependencies [[org.clojure/clojurescript "0.0-3308"]]
                   :plugins [[lein-cljsbuild "1.0.6"]]
                   :test-paths ["test/cljc"]
                   :cljsbuild
                   {:builds [{:id "test"
                              :source-paths ["test/cljc"
                                             "test/cljs"]
                              :compiler {:output-to "target/js/test.js"
                                         :output-dir "target/js"
                                         :optimizations :none
                                         :target :nodejs
                                         :cache-analysis true}}]}}})
