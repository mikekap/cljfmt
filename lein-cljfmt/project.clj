(defproject lein-cljfmt-mk "0.5.2"
  :description "A forked library for formatting Clojure code"
  :url "https://github.com/mikekap/cljfmt"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[cljfmt-mk "0.5.2"]
                 [meta-merge "0.1.1"]
                 [com.googlecode.java-diff-utils/diffutils "1.2.1"]])
