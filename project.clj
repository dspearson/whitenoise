(defproject whitenoise "master-SNAPSHOT"
  :description "Noise Protocol"
  :license {:name "ISC"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :plugins [[cider/cider-nrepl "0.22.0"]]
  :main ^:skip-aot whitenoise.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
