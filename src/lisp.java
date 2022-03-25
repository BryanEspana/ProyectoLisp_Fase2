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
    static HashMap<String,datos> Hashvar = new HashMap<>();
    static space Space = space.getInstance();


    public void LispMain(){
        while(true){
        String instructions = scan.nextLine();
        String result = instr.expressions(instructions);
        Space.ejecutar(instructions, result);
            
        }
    }
private static void print(String instructions){
    instructions = instructions.replaceAll("print", "");
    Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE); //
    Matcher matcher = pattern.matcher(instructions);
    if(matcher.find()){
        System.out.println(matcher.group().trim());
    }
    pattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE); //
    matcher = pattern.matcher(instructions);
    if(matcher.find()){
        if(Hashvar.containsKey(matcher.group().trim())){
            System.out.println(Hashvar.get(matcher.group().trim()));
        }else{
            System.out.println((matcher.group().trim()));
        }
    }
    pattern = Pattern.compile("['][a-z]+[']", Pattern.CASE_INSENSITIVE); //
    matcher = pattern.matcher(instructions);
    if (matcher.find()) {
        String temp = matcher.group().trim();
        temp = temp.replaceAll("'", "");
        System.out.println(temp);
    }
}
}
