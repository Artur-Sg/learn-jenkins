(defproject ops_school "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring "1.8.0"]
                 [metosin/muuntaja "0.6.6"]]
  :main ops-school.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
