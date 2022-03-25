/*
* UNIVERSIDAD DEL VALLE DE GUATEMALA
* INGENIERIA EN CIENCIAS DE LA COMPUTACION Y TECNOLOGIAS DE LA INFORMACION
* ALGORITMOS Y ESTRUCTURA DE DATOS - SECCION 10
* FACULTAD DE INGENIERIA
* PROYECTO 1 - INTERPRETE DE LISP
* INTEGRANTES: BRYAN CARLOS ROBERTO ESPANA MACHORRO | 21550
*              ANGEL GABRIEL PEREZ FIGUEROA         | 21298
*              JAVIER ALEJANDRO PRADO RAMIREZ       | 21486
*/

//IMPORTACIONES
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Base64.Decoder;
import java.util.regex.Matcher;


public class lisp {
    //llamar a las clases que sean necesarias
    static Scanner scan = new Scanner(System.in);
    static lispinstructions instr = new lispinstructions();
    static factory factory = new factory();
    static HashMap<String,datos> Hashvar = new HashMap<>();
    static space Space = space.getInstance();

    //Menu Lisp
    public void LispMain(){
        while(true){
        String instructions = scan.nextLine();
        String Respuesta = instr.expressions(instructions);
        Space.ejecutar(instructions, Respuesta);
            
        }
    }

    /** 
    * @param instructions
    */
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
            }
            else{
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
