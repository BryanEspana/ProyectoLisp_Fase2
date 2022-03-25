/*
Clase que decodifica la instructions de lisp
*/
import java.time.format.TextStyle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lispinstructions {
        /*
    Metodo para evaluar la instructions deseada
    */
    private static boolean test(String regex, String instructions) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(instructions);
	    return matcher.find();
	}
    /*
    Regresa un objeto correspondiente de la instructions, puede regresar variables y funciones, 
    si es desconocido ,instructions artimetica u otro comando regresa el string
    */
    
    public String expressions(String instructions){
    
        /*revisar si es una asigncion de variable
        */
        if(test("^[(][ ]*setq[ ]+[a-zA-Z0-9]+[ ]+[0-9]+[ ]*[)]$",instructions) || test("^[(][ ]*setq[ ]+[:alnum:]+[ ]+['][a-zA-Z0-9]+['][ ]*[)]$",instructions)){
            return "NEWVAR";
        }
        if(test("^[(][ ]*end[ ]*[)]$",instructions)){
            return "END";
        }
        if(test("^[(][ ]*print[ ]+[a-z][ ]*[)]$",instructions)|| test("^[(][ ]*print[ ]+[0-9][ ]*[)]$",instructions) ){
            return "PRINT";
        }
        if(test("^[(][ ]*print[ ]+['][a-zA-Z0-9]+['][ ]*[)]$",instructions)){
             return "PRINT";
        }
        if (test("^[(][ ]*[+][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "ADD";
        }
        if (test("^[(][ ]*[-][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "QUIT";
        }
        if (test("^[(][ ]*[*][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "MUL";
        }
        if (test("^[(][ ]*[/][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "DIV";
        }
        if (test("^[(][ ]*equal[ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",instructions)){
            return "DIV";
        }
          return null;
    }
}