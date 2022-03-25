/*
* UNIVERSIDAD DEL VALLE DE GUATEMALA
* INGENIERIA EN CIENCIAS DE LA COMPUTACION Y TECNOLOGIAS DE LA INFORMACION
* ALGORITMOS Y ESTRUCTURA DE DATOS - SECCION 10
* FACULTAD DE INGENIERIA
* PROYECTO 1 - INTERPRETE DE LISP
* INTEGRANTES: BRYAN CARLOS ROBERTO ESPANA MACHORRO | 21550
*              ANGEL GABRIEL PEREZ FIGUEROA         | 21298
*              JAVIER ALEJANDRO PRADO RAMIREZ       | 21486
*/

//IMPORTACIONES
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


/*
* CLASE ENCARGADA DE MOSTRAR EL FUNCIONAMIENTO DEL PROGRAMA
*/
public class controlador {
    static Scanner scan = new Scanner(System.in);
    static lispinstructions decode = new lispinstructions();
    static space env = space.getInstance();
    
    public void imprimir(){
        //Menu inicial del interprete de Lisp
        while(true){
            
            String expresion = scan.nextLine();
            String result = decode.expressions(expresion);
            env.ejecutar(expresion, result);     
            }
        }
}
