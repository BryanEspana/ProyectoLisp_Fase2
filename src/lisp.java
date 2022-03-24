import java.util.HashMap;
import java.util.Scanner;
import java.util.Base64.Decoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class lisp {
    static Scanner scan = new Scanner(System.in);
    static lispinstructions instr = new lispinstructions();
    static factory factory = new factory();
    static HashMap<String,datos> vars = new HashMap<>();
    
    public void LispMain(){
        while(true){
            String instructions = scan.nextLine();
            String result = instr.expressions(instructions);
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
                            System.out.println("la variable " + temp.nombre + " fue creada exitosamente");
                        }
                    }
                    
                }
            }else{
                System.out.println("No se pudo ejecutar correctamente las instrucciones");
            }
            
        }
    }
private static void print(String expresion){
    expresion = expresion.replaceAll("print", "");
    Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE); //
    Matcher matcher = pattern.matcher(expresion);
    if(matcher.find()){
        System.out.println(matcher.group().trim());
    }
    pattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE); //
    matcher = pattern.matcher(expresion);
    if(matcher.find()){
        if(vars.containsKey(matcher.group().trim())){
            System.out.println(vars.get(matcher.group().trim()));
        }else{
            System.out.println((matcher.group().trim()));
        }
    }
    pattern = Pattern.compile("['][a-z]+[']", Pattern.CASE_INSENSITIVE); //
    matcher = pattern.matcher(expresion);
    if (matcher.find()) {
        String temp = matcher.group().trim();
        temp = temp.replaceAll("'", "");
        System.out.println(temp);
    }
}
}
