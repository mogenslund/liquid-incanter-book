# ======================================================== #
# This is a demo page of using incanter from inside liquid #
# ======================================================== #

# Navigation
# ==========

With blue cursor, navigate with "i" "j" "k" "l". Try it.
To insert text use tab to switch to green cursor. Use Tab again to switch
back to blue cursor for navigation.
For more options look at

    https://github.com/mogenslund/liquid/wiki/Cheat-Sheet


# Evaluation
# ==========

With blue cursor click "e" to evaluate current s-expression:
Place cursor inside these parentheses (range 10) and click "e".
Observe the expression is evaluated.

Notice what is evaluated depends on where in the expression the
cursor is placed. Try pressing "e" and "1" (toggle highlight expression)
on different locations inside the expression below:

    (println "Something" (range 3) (range 4))

Try changing something and evaluate again.


# Incanter
# ========

Incanter is loaded together with this editor. There is a .liq file
at the root of this project containing the imports.

In the expression below click "e" on "view":

    (view (histogram (sample-normal 1000)))

This will display a chart window using Incanter.


# File navigation
# ===============

Click CTRL+o on the filename below to navigate to it:

    incanterdemo.md

Navigation to a non existing file will just create it. (Creation
is not performed until save.)