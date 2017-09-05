(defproject liqibook "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [mogenslund/liquid "0.8.1"]
                 [incanter/incanter-core "1.9.1"]
                 [incanter/incanter-io "1.9.1"]
                 [incanter/incanter-charts "1.9.1"]]
  :main ^:skip-aot liqibook.core
  :target-path "/tmp/liqibook/target/%s/"
  :profiles {:uberjar {:aot :all}
             :liq {:main dk.salza.liq.core}}
  :aliases {"liq" ["with-profile" "liq" "run" "--load=.liq"]})