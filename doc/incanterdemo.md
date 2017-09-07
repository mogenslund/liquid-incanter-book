# ============= #
# Incanter Demo #
# ============= #

To get back CTRL+o the filename: intro.md


# Plotting a function
# ===================

Evaluate the s-expressions below to create plot data for the
sine function and to view the plot:

    (def my-plot (function-plot sin -10 10))
    (view my-plot)

# Plotting data
# =============

Evalute while the cursor is on "let". This will plot some points.

    (let [x [1 2 3 4 5 6 5 4 3 2 1]
          y [6 5 4 3 4 5 6 5 4 3 2]]
      (view (scatter-plot x y)))


# More advanced plot
# ==================

Evaluate the expression below to plot the sierpinsky triangle:

    (let [[x y] (loop [x '(0) y '(0) n 0]
                  (if (> n 10000) [x y]
                    (let [r  (rand-int 3)
                          x1 (+ (* 0.5 (first x)) (if (= r 0) 0.5 0))
                          y1 (+ (* 0.5 (first y)) (if (= r 1) 0.5 0))]
                      (recur (conj x x1) (conj y y1) (+ n 1)))))]
      (view (scatter-plot x y)))


# Two functions in same plot
# ==========================

    (doto (function-plot sin -10 10)
      (add-function cos -10 10)
      view)