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
import java.time.format.TextStyle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lispinstructions {
    
    /** 
     * @param regex
     * @param instructions
     * @return boolean
     */

    //verificar instrucciones dadas
    private static boolean test(String regex, String instructions) {
		Pattern patron = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	    Matcher Emp = patron.matcher(instructions);
	    return Emp.find();
	}
    
    /** 
     * @param instructions
     * @return String
     */

    //regresa objetos como instruccion, de lo contrario retorna un string
    public String expressions(String instructions){
        //se asigna una variable
        if(test("^[(][ ]*setq[ ]+[a-zA-Z0-9]+[ ]+[0-9]+[ ]*[)]$",instructions) || test("^[(][ ]*setq[ ]+[:alnum:]+[ ]+['][a-zA-Z0-9]+['][ ]*[)]$",instructions)){
            return "NEWVAR";
        }
        
        //valor para finalizar el programa "END" en la consola
        if(test("^[(][ ]*end[ ]*[)]$",instructions)){
            return "END";
        }
        
        //Imprime el texto 
        if(test("^[(][ ]*print[ ]+[a-z][ ]*[)]$",instructions)|| test("^[(][ ]*print[ ]+[0-9][ ]*[)]$",instructions) ){
            return "PRINT";
        }
        
        //Imprime el texto 
        if(test("^[(][ ]*print[ ]+['][a-zA-Z0-9]+['][ ]*[)]$",instructions)){
             return "PRINT";
        }
        
        //Imprime la suma cuando se tengan 2 variables
        if (test("^[(][ ]*[+][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "SUM";
        }
        
        //Imprime la resta cuando se tengan 2 variables
        if (test("^[(][ ]*[-][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "QUIT";
        }
        
        //Imprime la multiplicación cuando se tengan 2 variables
        if (test("^[(][ ]*[*][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "MUL";
        }
        
        //Imprime la division cuando se tengan 2 variables
        if (test("^[(][ ]*[/][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "DIV";
        }
        
        //Imprime la division cuando se tengan 2 variables
        if (test("^[(][ ]*equal[ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "div";
        }
        return null;
    }
}