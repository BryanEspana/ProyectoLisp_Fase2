
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lispinstructions {
    
    private static boolean test(String exp, String instructions) {
		Pattern patron = Pattern.compile(exp, Pattern.CASE_INSENSITIVE);
	    Matcher Emp = patron.matcher(instructions);
	    return Emp.find();
	}

    public String expressions(String instructions){
        if(test("^[(][ ]*setq[ ]+[a-z]+[ ]+[0-9]+[ ]*[)]$",instructions) || test("^[(][ ]*setq[ ]+[a-z]+[ ]+['][a-z]+['][ ]*[)]$",instructions)){
            return "newvar";
        }
        if(test("^[(][ ]*end[ ]*[)]$",instructions)){
            return "end";
        }
        if(test("^[(][ ]*print[ ]+[a-z][ ]*[)]$",instructions)|| test("^[(][ ]*print[ ]+[0-9][ ]*[)]$",instructions) ){
            return "print";
        }
        if(test("^[(][ ]*print[ ]+['][a-z]+['][ ]*[)]$",instructions)){
             return "print";
        }
          return null;
    }

   
}