import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Clase Singleton del ambiente de ejecucion
*/
public class space{
     
     factory factory = new factory();
     HashMap<String,datos> Hashvar = new HashMap<>();
     operadores operator = new operadores();

    private static space env;// variable estatica
    private space(){
    
    }
    public synchronized static space getInstance() {
        if (env == null) {
            env = new space();
        }
        return env;
    }
    
    public synchronized void ejecutar(String expresion, String result){
    if(result != null){
                switch(result){
                    case "END" -> {
                        System.out.println("You can't end me, kidding have a nice day");
                        System.exit(0);
                    }
                    case "PRINT" ->{
                        print(expresion);
                    }
                    case "NEWVAR" ->{
                        datos temp = factory.VariableCreator(expresion);
                        if(temp != null){
                        Hashvar.put(temp.nombre, temp);
                            System.out.println("Variable " + temp.nombre + " created correctly");
                        }
                    } 
                    case "ADD" ->{
                        operator.add(expresion, Hashvar);
                    }
                    case "QUIT" ->{
                        operator.quit(expresion, Hashvar);
                    }
                    case "MUL "
                        + "" ->{
                        operator.multi(expresion, Hashvar);
                    }
                    case "DIV" ->{
                        operator.div(expresion, Hashvar);
                    }
                    
                }
            }else{
                System.out.println("Expresion coulnd't be excecuted correctly");
            }
    
    }
     private synchronized void print(String expresion){
        expresion = expresion.replaceAll("print", "");
        Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE); //
	Matcher matcher = pattern.matcher(expresion);
        if(matcher.find()){
            System.out.println(matcher.group().trim());
        }
        pattern = Pattern.compile("['][a-z]+[']", Pattern.CASE_INSENSITIVE); //
        matcher = pattern.matcher(expresion);
        if (matcher.find()) { 
                 String temp = matcher.group().trim();
                 temp = temp.replaceAll("'", "");
                 System.out.println(temp);
        }
        
        pattern = Pattern.compile("[ ]+[a-z]+[ ]*", Pattern.CASE_INSENSITIVE); //
        matcher = pattern.matcher(expresion);
        if(matcher.find()){
            if(Hashvar.containsKey(matcher.group().trim())){
                 System.out.println(Hashvar.get(matcher.group().trim()).getValue());
            }else{
                System.out.println((matcher.group().trim()) + "\t is not defined yet");
            }
        }
        
    
    
    }
    
}
