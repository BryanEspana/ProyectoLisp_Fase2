

/*
    Proyecto Fase #2 - Implementación de Lisp en Java
    Catedratico: Moises Alonso
    Auxs: Cristian Laynez y Rudik Rompich
    Integrantes:
        Angel Figueroa -21298
        Bryan España - 21550
        Javier Prado - 21486
*/


import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    static Scanner scan = new Scanner(System.in);
    static lispinstructions decode = new lispinstructions();
    static space env = space.getInstance();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("i i i i i i i       ooooo    o        ooooooo   ooooo   ooooo\n"+
        "I I I I I I I      8     8   8           8     8     o  8    8\n"+
        "I \\ `+' /  I      8         8           8     8        8    8\n"+
        "\\  `-+-'  /       8         8           8      ooooo   8oooo\n"+
        "  `-__|__-'        8         8           8           8  8\n"+
        "      |            8     o   8           8     o     8  8\n"+
        "------+------       ooooo    8oooooo  ooo8ooo   ooooo   8\n");
        System.out.println("--Bienvendio a GNU CLISP<http://clisp.cons.org/>");
        System.out.println("--Escribe entre parentesis '()' ");

    while(true){
        String expresion = scan.nextLine();
        String result = decode.expressions(expresion);
        env.ejecutar(expresion, result);
            
    }
    
        
    
    
    }
}
