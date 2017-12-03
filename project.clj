(defproject com.github.ane/codox-kingfisher-theme "0.1.0-SNAPSHOT"
  :description "kingfisher is a pretty pretty theme" 
  :url "http://github.com/ane/codox-kingfisher-theme"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :deploy-repositories [["releases" :clojars]]
  :plugins [[test2junit "1.1.2"]
            [lein-codox "0.10.3"]]
  :codox {:output-path "docs"
          :themes [:default :kingfisher]
          :metadata {:doc/format :markdown}
          :source-uri "https://github.com/ane/codox-kingfisher-theme/blob/master/{filepath}#L{line}"}
  :test2junit-output-dir ~(or (System/getenv "CIRCLE_TEST_REPORTS") "target/test2junit"))
