import java.util.HashMap;
import java.util.Scanner;
import java.util.Base64.Decoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class lisp {
    static Scanner me = new Scanner(System.in);
    static lispinstructions instr = new lispinstructions();
    static factory factory = new factory();
    static HashMap<String,print> vars = new HashMap<>();

    public void LispMain(){
        while(true){
            String instructions = me.nextLine();
            String result = instr.expressions(instructions);
            if(result != null){
                switch(result){
                    case "end" -> {
                        System.out.println("You can't end me, kidding have a nice day");
                        System.exit(0);
                    }
                    case "print" ->{
                        print(instructions);
                    }
                    
                    case "newvar" ->{
                        print temp = factory.VariableCreatot(instructions);
                        if(temp != null){
                        vars.put(temp.nombre, temp);
                            System.out.println("Variable " + temp.nombre + " created correctly");
                        }
                    }
                    
                }
            }else{
                System.out.println("instructions coulnd't be excecuted correctly");
            }
        }
    }
    
   
}
