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

    public void menuLisp(){
        System.out.println("i i i i i i i       ooooo    o        ooooooo   ooooo   ooooo\n"+
        "I I I I I I I      8     8   8           8     8     o  8    8\n"+
        "I \\ `+' /  I      8         8           8     8        8    8\n"+
        "\\  `-+-'  /       8         8           8      ooooo   8oooo\n"+
        "  `-__|__-'        8         8           8           8  8\n"+
        "      |            8     o   8           8     o     8  8\n"+
        "------+------       ooooo    8oooooo  ooo8ooo   ooooo   8\n");
        System.out.println("--Bienvendio a GNU CLISP<http://clisp.cons.org/>");
        System.out.println("--Escribe entre parentesis '()' ");
    }
    
}
