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

public class controlador {
    static Scanner scan = new Scanner(System.in);
    static lispinstructions decode = new lispinstructions();
    static space env = space.getInstance();
    
    public void imprimir(){
        //Menu Lisp
        while(true){
            String expresion = scan.nextLine();
            String result = decode.expressions(expresion);
            env.ejecutar(expresion, result);     
            }
        }
}
