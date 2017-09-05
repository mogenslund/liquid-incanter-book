# This is a demo page of using incanter from inside liquid #

(view (histogram (sample-normal 1000)))

(def my-plot (function-plot sin -10 10))

(view my-plot)

(view (to-dataset [[1 2 3] [4 5 6]]))


(defn weather-for-month [month]
  (-> (format "http://www.wunderground.com/history/airport/EGLL/2012/%d/10/MonthlyHistory.html?format=1" month)
      (read-dataset :header true)))

; get weather data for each month in 2012 and build single dataset
(def data (->> (range 1 13) (map weather-for-month) (apply conj-rows)))
(def data (->> (range 1 13) (map weather-for-month)))

(p data)
(apply conj-rows data)
; view dataset in a table and view histogram of mean temperature
(view data)
(view (histogram "Mean TemperatureC" :nbins 100 :data data))

; function that given month "2012-9-20" extracts month and returns 9
(defn month [date] (Integer/parseInt (second (.split date "-"))))

; dataset that contains 2 columns: month and mean temperature for that month
(def grouped-by-month
  (->> (map (fn [date temp] {:month (month date) :temp temp})
            ($ "GMT" data) ($ "Mean TemperatureC" data))
       to-dataset
       ($rollup :mean :temp :month)
       ($order :month :asc)))

; view line chart that shows that August was the warmest month
(view (line-chart :month :temp :data grouped-by-month))