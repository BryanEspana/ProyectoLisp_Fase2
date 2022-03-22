;Grupo 2:
;Bryan España - 21550
;Javier Prado - 21486
;Angel Perez - 21298

;Convertir numero a una serie de fibbonaci
(defun fibonacci (n) ;fibbonaci
  (cond 
    ( (< n 2) n); regresa 0 y 1 en la serie de fibonacci 
    (t (+ (fibonacci (- n 1)) (fibonacci (- n 2)))) ;de lo contrario lo evalua de n-1 y de n-2
    )
)

;Convertir numero a Factorial
(defun factorial (num)
    (if (= num  0) 1
        (setq fact (* num (factorial(- num 1))))
    ) 
)


;Celcius a Farengeint
(defun converter(num) ; C a F 
    (+ ( * (* 1.8) num) 32)
)

;Farengeint a celcius
(defun far (num) ;F a C
    (* (- num 32) (* 0.555555556))
)
(print "El numero que escogiste se convertira en:")
(print "---Serie Fibonacci")
(print "---Factorial")
(print "---De celsius a farengeint")
(print "---De farengeint a celsius")

(print "Escriba el numero que desea convertir")
(defvar number (read))
(print "")
(print "*************Resultado en Serie de Fibonacci************")
(print(fibonacci number))
(print "")
(print "*****************Resultado en Factorial*****************")
(print (factorial number))
(print "")
(print "**********Resultado convertir de celsius a farengeint*************")
(print (converter number))
(print " ")
(print "*********Resultado convertir de farengeiht a caelcius************")
(print (far number))