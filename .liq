(ns user
  (:require [dk.salza.liq.editor :as editor]
            [dk.salza.liq.clojureutil :as clojureutil]
            [dk.salza.liq.tools.cshell :refer :all]
            [dk.salza.liq.apps.textapp :as textapp]
            [dk.salza.liq.logging :as logging]
            [dk.salza.liq.tools.util :as util])
  (:use [incanter core stats charts io datasets]))