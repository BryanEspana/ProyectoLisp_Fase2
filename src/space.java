import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Clase Singleton del ambiente de ejecucion
*/
public class space {
     
     factory factory = new factory();
     HashMap<String,datos> vars = new HashMap<>();
     operadores operators = new operadores();

    private static space env;// variable estatica
    private space(){
    
    }
    public synchronized static space getInstance() {
        if (env == null) {
            env = new space();
        }
        return env;
    }
    
    public synchronized void ejecutar(String instructions, String result){
    if(result != null){
                switch(result){
                    case "END" -> {
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                    }
                    case "PRINT" ->{
                        print(instructions);
                    }
                    
                    case "NEWVAR" ->{
                        datos temp = factory.VariableCreator(instructions);
                        if(temp != null){
                        vars.put(temp.nombre, temp);
                            System.out.println("Variable " + temp.nombre + " created correctly");
                        }
                    }
                    
                    case "ADD" ->{
                        operators.add(instructions, vars);
                    }
                    case "RES" ->{
                        operators.res(instructions, vars);
                    }
                    case "MUL "
                        + "" ->{
                        operators.multi(instructions, vars);
                    }
                    case "DIV" ->{
                        operators.div(instructions, vars);
                    }
                    
                }
            }else{
                System.out.println("instructions coulnd't be excecuted correctly");
            }
    
    }
     private synchronized void print(String instructions){
        instructions = instructions.replaceAll("print", "");
        Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE); //
	Matcher matcher = pattern.matcher(instructions);
        if(matcher.find()){
            System.out.println(matcher.group().trim());
        }
        pattern = Pattern.compile("['][a-z]+[']", Pattern.CASE_INSENSITIVE); //
        matcher = pattern.matcher(instructions);
        if (matcher.find()) { 
                 String temp = matcher.group().trim();
                 temp = temp.replaceAll("'", "");
                 System.out.println(temp);
        }
        
        pattern = Pattern.compile("[ ]+[a-z]+[ ]*", Pattern.CASE_INSENSITIVE); //
        matcher = pattern.matcher(instructions);
        if(matcher.find()){
            if(vars.containsKey(matcher.group().trim())){
                 System.out.println(vars.get(matcher.group().trim()).getValue());
            }else{
                System.out.println((matcher.group().trim()) + "\t no esta definida");
            }
        }
        
    
    
    }
    
}
