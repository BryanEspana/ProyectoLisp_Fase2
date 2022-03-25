import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class factory {
    public datos VariableCreator(String instructions) {
        Pattern pattern = Pattern.compile("[ ]+[a-zA-Z0-9]+[ ]+", Pattern.CASE_INSENSITIVE); //
	    Matcher matcher = pattern.matcher(instructions);
	    String varName = "";
            if (matcher.find()) {
	         varName = matcher.group();
                 varName = varName.replaceAll(" ", "");
	    
            /*
            Revisar si es valor numerico
            */
            pattern = Pattern.compile("[ ]+[0-9]+[ ]*", Pattern.CASE_INSENSITIVE); //
	     matcher = pattern.matcher(instructions);
	     if (matcher.find()) { 
                 /*
                 Si es numerico regresar la variable
                 */
	    	 return new datos<Integer>(Integer.parseInt(matcher.group().trim()), varName);
                }
             
             pattern = Pattern.compile("[ ]+['][a-zA-Z0-9]+['][ ]*", Pattern.CASE_INSENSITIVE); //
	     matcher = pattern.matcher(instructions);
             if (matcher.find()) { 
                 String temp = matcher.group().trim();
                 temp = temp.replaceAll("'", "");
                 return new datos<String>(temp, varName); 
                }
                
            }else{
                System.out.println("Error: Sintaxis invalida");
                return null;
            }
            return null;
    }
}