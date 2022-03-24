import java.util.HashMap;
import java.util.Scanner;
import java.util.Base64.Decoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class lisp {
    static Scanner me = new Scanner(System.in);
    static Decodificador decode = new Decodificador();
    static AtomsFactory AF = new AtomsFactory();
    static HashMap<String,Variable> vars = new HashMap<>();

    public void saber(){
        while(true){
            String instructions = me.nextLine();
            String result = decode.decode(instructions);
            if(result != null){
                switch(result){
                    case "END" -> {
                        System.out.println("You can't end me, kidding have a nice day");
                        System.exit(0);
                    }
                    case "PRINT" ->{
                        print(instructions);
                    }
                    
                    case "NEWVAR" ->{
                        Variable temp = AF.VariableCreatot(instructions);
                        if(temp != null){
                        vars.put(temp.name, temp);
                            System.out.println("Variable " + temp.name + " created correctly");
                        }
                    }
                    
                }
            }else{
                System.out.println("instructions coulnd't be excecuted correctly");
            }
        }
    }
    
   
}
