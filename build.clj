(require '[cljs.build.api :as cljs])

(cljs/build "src"
            {:main 'foo.main
             :output-to "out/main.js"
             :verbose true
             :infer-externs true
             :parallel-build true})
