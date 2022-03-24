
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lispinstructions {
    
    private static boolean test(String exp, String instructions) {
		Pattern pattern = Pattern.compile(exp, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(instructions);
	    return matcher.find();
	}

    public String decode(String instructions){
        if(test("^[(][ ]*setq[ ]+[a-z]+[ ]+[0-9]+[ ]*[)]$",instructions) || test("^[(][ ]*setq[ ]+[a-z]+[ ]+['][a-z]+['][ ]*[)]$",instructions)){
            return "NEWVAR";
        }
        if(test("^[(][ ]*end[ ]*[)]$",instructions)){
            return "END";
        }
        if(test("^[(][ ]*print[ ]+[a-z][ ]*[)]$",instructions)|| test("^[(][ ]*print[ ]+[0-9][ ]*[)]$",instructions) ){
            return "PRINT";
        }
        if(test("^[(][ ]*print[ ]+['][a-z]+['][ ]*[)]$",instructions)){
             return "PRINT";
        }
          return null;
    }

   
}