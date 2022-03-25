/*
    Proyecto Fase #2 - Implementación de Lisp en Java
    Catedratico: Moises Alonso
    Auxs: Cristian Laynez y Rudik Rompich
    Integrantes:
        Angel Figueroa -21298
        Bryan España - 21550
        Javier Prado - 21486
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class factory {

    public datos VariableCreator(String instructions) {
        //Implementación Case Insinsitive
        Pattern patron = Pattern.compile("[ ]+[a-zA-Z0-9]+[ ]+", Pattern.CASE_INSENSITIVE); //
	    Matcher Emp = patron.matcher(instructions);
        //El namebar se coloca el Matcher
	    String namebar = "";
            if (Emp.find()) {
	         namebar = Emp.group();
                 namebar = namebar.replaceAll(" ", "");
            //Para ver si es numerico o no
            patron = Pattern.compile("[ ]+[0-9]+[ ]*", Pattern.CASE_INSENSITIVE); //
            Emp = patron.matcher(instructions);
	     if (Emp.find()) { 
                 //Si es int regresa el int
	    	 return new datos<Integer>(Integer.parseInt(Emp.group().trim()), namebar);
                }
             patron = Pattern.compile("[ ]+['][a-zA-Z0-9]+['][ ]*", Pattern.CASE_INSENSITIVE); //
             Emp = patron.matcher(instructions);
             if (Emp.find()) { 
                 String temp = Emp.group().trim();
                 temp = temp.replaceAll("'", "");
                 return new datos<String>(temp, namebar); 
                }
            }else{
                System.out.println("Error: Sintaxis invalida");
                return null;
            }
            return null;
    }
}