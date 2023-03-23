(defproject org.soulspace.clj/cmp.exif "0.1.1"
  :description "The cmp.exif is a library for reading EXIF tags on images"
  :url "https://github.com/soulspace-org/cmp.exif"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ; use deps.edn dependencies
  :plugins [[lein-tools-deps "0.4.5"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]}

  :scm {:name "git" :url "https://github.com/soulspace-org/cmp.exif"}
  :deploy-repositories [["clojars" {:sign-releases false :url "https://clojars.org/repo"}]])
