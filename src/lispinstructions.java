
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lispinstructions {
    
    private static boolean test(String exp, String instructions) {
		Pattern patron = Pattern.compile(exp, Pattern.CASE_INSENSITIVE);
	    Matcher Emp = patron.matcher(instructions);
	    return Emp.find();
	}

    public String expressions(String expresion){
    
        /*revisar si es una asigncion de variable
        */
        if(test("^[(][ ]*setq[ ]+[a-z]+[ ]+[0-9]+[ ]*[)]$",expresion) || test("^[(][ ]*setq[ ]+[a-z]+[ ]+['][a-z]+['][ ]*[)]$",expresion)){
            return "NEWVAR";
        }
        if(test("^[(][ ]*end[ ]*[)]$",expresion)){
            return "END";
        }
        if(test("^[(][ ]*print[ ]+[a-z][ ]*[)]$",expresion)|| test("^[(][ ]*print[ ]+[0-9][ ]*[)]$",expresion) ){
            return "PRINT";
        }
        if(test("^[(][ ]*print[ ]+['][a-z]+['][ ]*[)]$",expresion)){
             return "PRINT";
        }
        if (test("^[(][ ][+][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ][)]$",expresion)){
            return "ADD";
        }
        if (test("^[(][ ][-][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ][)]$",expresion)){
            return "QUIT";
        }
        if (test("^[(][ ][][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ]*[)]$",expresion)){
            return "MUL";
        }
        if (test("^[(][ ][/][ ]+[([a-z]+|[0-9]+)[ ]+([a-z]+|[0-9]+)]+[ ][)]$",expresion)){
            return "DIV";
        }
          return null;
    }

   
}