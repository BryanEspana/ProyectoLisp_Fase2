/* 
    Hoja de Trabajo #6
    Bryan Carlos Roberto España Machorro - 21550
    Algoritmos y Estructura de Datos - Sección 10
    Catedratico: Moises Alonso
    Auxiliares:  Cristian Laynez y Rudik Rompich
*/

import java.util.Scanner;

public class vista {
    Scanner Scan = new Scanner(System.in);
    lisp Lisp = new lisp();
    /*** 
     * This method is MAPS menu
    */
    public int menuLisp(){
        System.out.println("El numero que colocas se convertira en:\n-Serie Fibonacci\n-Factorial\n-De celsius a farengeint\n-De farengeint a celsius");
        System.out.println("Coloca el numero:");
        int opcion = Scan.nextInt();
        return opcion; 
    }
    public void Fibonacci(){
        System.out.println("*************Resultado en Serie de Fibonacci************");
        //lisp.fibonacci();
    }
    public void Factorial(){
        System.out.println("*****************Resultado en Factorial*****************");
        //lisp.Factorial();
    }
    public void CelsiusFareng(){
        System.out.println("**********Resultado convertir de celsius a farengeint************");
        //lisp.Factorial();
    }
    public void FarengCelsius(){
        System.out.println("*********Resultado convertir de farengeiht a caelcius************");
        //lisp.Factorial();
    }
}
