import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class factory {
    public print VariableCreatot(String expresion) {
        //Hallar el nombre y el valor
        Pattern patron = Pattern.compile("[ ]+[a-z]+[ ]+", Pattern.CASE_INSENSITIVE); //
	    Matcher Emp = patron.matcher(expresion);
	    String nombre = "";
            if (Emp.find()) {
                nombre = Emp.group();
	    

        //Revisar si es valor numerico
        patron = Pattern.compile("[ ]+[0-9]+[ ]*", Pattern.CASE_INSENSITIVE); //
	    Emp = patron.matcher(expresion);
	        if (Emp.find()) { 
                //Si es numerico regresar la variable
	    	    return new print<Integer>(Integer.parseInt(Emp.group().trim()), nombre);
                    }
             
        patron = Pattern.compile("[ ]+['][a-z]+['][ ]*", Pattern.CASE_INSENSITIVE); //
	    Emp = patron.matcher(expresion);
             if (Emp.find()) { 
                 String temp = Emp.group().trim();
                 temp = temp.replaceAll("'", "");
                 return new print<String>(temp, nombre); 
                }
                
            }else{
                System.out.println("Invalid sintaxis for variable declaration");
                return null;
            }
            return null;
    }
}
