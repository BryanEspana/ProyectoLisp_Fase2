/*
    Proyecto Fase #2 - Implementación de Lisp en Java
    Catedratico: Moises Alonso
    Auxs: Cristian Laynez y Rudik Rompich
    Integrantes:
        Angel Figueroa -21298
        Bryan España - 21550
        Javier Prado - 21486
*/
import java.time.format.TextStyle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lispinstructions {
    //Evaluar instructions
    private static boolean test(String regex, String instructions) {
		Pattern patron = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	    Matcher Emp = patron.matcher(instructions);
	    return Emp.find();
	}
    //Regresa un objeto correspondiente de la instructions, si no lo devuelve como string
    public String expressions(String instructions){
        //Asignación de variable
        if(test("^[(][ ]*setq[ ]+[a-zA-Z0-9]+[ ]+[0-9]+[ ]*[)]$",instructions) || test("^[(][ ]*setq[ ]+[:alnum:]+[ ]+['][a-zA-Z0-9]+['][ ]*[)]$",instructions)){
            return "NEWVAR";
        }
        //Terminar programa 
        if(test("^[(][ ]*end[ ]*[)]$",instructions)){
            return "END";
        }
        //Imprime el texto o variable creada
        if(test("^[(][ ]*print[ ]+[a-z][ ]*[)]$",instructions)|| test("^[(][ ]*print[ ]+[0-9][ ]*[)]$",instructions) ){
            return "PRINT";
        }
        //Imprime el texto o variable creada
        if(test("^[(][ ]*print[ ]+['][a-zA-Z0-9]+['][ ]*[)]$",instructions)){
             return "PRINT";
        }
        //Imprime la suma de dos variables
        if (test("^[(][ ]*[+][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "SUM";
        }
        //Imprime la resta de dos variables
        if (test("^[(][ ]*[-][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "QUIT";
        }
        //Imprime la multiplicación de dos variables
        if (test("^[(][ ]*[*][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "MUL";
        }
        //Imprime la division de dos variables
        if (test("^[(][ ]*[/][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "DIV";
        }
        //Imprime la division de dos variables
        if (test("^[(][ ]*equal[ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "div";
        }
          return null;
    }
}