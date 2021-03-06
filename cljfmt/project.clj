(defproject cljfmt-mk "0.5.2"
  :description "A forked library for formatting Clojure code"
  :url "https://github.com/mikekap/cljfmt"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.reader "1.0.0-alpha4"]
                 [rewrite-clj "0.4.12"]
                 [rewrite-cljs "0.4.1"]]
  :plugins [[lein-cljsbuild "1.1.2"]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild {:builds
              {"dev" {:source-paths ["src" "test"]
                      :compiler {:main cljfmt.test-runner
                                 :output-to "target/out/tests.js"
                                 :output-dir "target/out"
                                 :target :nodejs
                                 :optimizations :none}}}
              :test-commands
              {"dev" ["node" "target/out/tests.js"]}}
  :profiles
  {:provided {:dependencies [[org.clojure/clojurescript "1.7.228"]]}})
