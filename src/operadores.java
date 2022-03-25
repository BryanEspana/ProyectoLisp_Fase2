import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Clase para la realizacion de operaciones aritmeticas
*/
public class operadores {
    public void add(String expresion, HashMap<String,datos> var){
        Integer total = 0;
        boolean print = true;
        Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
        Matcher matcher = pattern.matcher(expresion);

    while (matcher.find()) {
            if(var.containsKey(matcher.group().trim())){
                if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
                total += (Integer) var.get(matcher.group().trim()).getValue();
                }else{
                    System.out.println("no hay operadores suficientes");
                    print = false;
                    break;
                }
            }else{
                try{
                total += Integer.parseInt(matcher.group().trim());
                } catch(NumberFormatException ei){
                    System.out.println( matcher.group().trim() + " No esta definida");
                    print = false;
                    break;
                }
            }
        
    }   if(print){
        System.out.println(total);
        }
    }
    
    
    public void res(String expresion, HashMap<String,datos> var){
    Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
    Matcher matcher = pattern.matcher(expresion);
    /*
    Usar el primer match como el valor inicial
    */
    Integer total = 0;
    boolean continuar = false;//en caso de no haber un match inicial se salta realizar la operacion
    if(matcher.find()){
        if(var.containsKey(matcher.group().trim())){
            if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
            total = (Integer) var.get(matcher.group().trim()).getValue();
            }else{
                System.out.println("no hay operadores suficientes");
                continuar = true;
            }
        }else{
            try{
            total = Integer.parseInt(matcher.group().trim());
            } catch(NumberFormatException ei){
                System.out.println( matcher.group().trim() + " no esta definido");
                continuar = true;
            }
        }
    }
       
    if(!continuar){
        boolean print = true;
        while (matcher.find()) {
                if(var.containsKey(matcher.group().trim())){
                    if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
                    total -= (Integer) var.get(matcher.group().trim()).getValue();
                    }else{
                        System.out.println("no hay operadores suficientes");
                        print = false;
                        break;
                    }
                }else{
                    try{
                    total -= Integer.parseInt(matcher.group().trim());
                    } catch(NumberFormatException ei){
                        System.out.println( matcher.group().trim() + " no esta definido");
                        print = false;
                        break;
                    }
                }

        }   if(print){
            System.out.println(total);
            }
        }
    }
    
    
    
    public void multi(String expresion, HashMap<String,datos> var){
    Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
    Matcher matcher = pattern.matcher(expresion);
    Integer total = 1; //se coloca como 1 puesto que no interfiere con el resultado de multiplicar los numeros
    boolean print = true;
    while (matcher.find()) {
            if(var.containsKey(matcher.group().trim())){
                if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
                total *= (Integer) var.get(matcher.group().trim()).getValue();
                }else{
                    System.out.println("no hay operadores suficientes");
                    print = false;
                    break;
                }
            }else{
                try{
                total *= Integer.parseInt(matcher.group().trim());
                } catch(NumberFormatException ei){
                    System.out.println( matcher.group().trim() + " no esta definido");
                    print = false;
                    break;
                }
            }
        
    }   if(print){
        System.out.println(total);
        }
    }
    
    
    public void div(String expresion, HashMap<String,datos> var){
    Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
    Matcher matcher = pattern.matcher(expresion);
    /*
    Usar el primer match como el valor inicial
    */
    Integer total = 0;
    boolean continuar = false;//en caso de no haber un match inicial se salta realizar la operacion
    if(matcher.find()){
        if(var.containsKey(matcher.group().trim())){
            if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
            total = (Integer) var.get(matcher.group().trim()).getValue();
            }else{
                System.out.println("no hay operadores suficientes");
                continuar = true;
            }
        }else{
            try{
            total = Integer.parseInt(matcher.group().trim());
            } catch(NumberFormatException ei){
                System.out.println( matcher.group().trim() + " no esta definido");
                continuar = true;
            }
        }
    }
    
    if(!continuar){
    boolean print = true;
        while (matcher.find()) {
            try{
                if(var.containsKey(matcher.group().trim())){
                    if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
                    total /= (Integer) var.get(matcher.group().trim()).getValue();
                    }else{
                        System.out.println("Incopatible operators");
                        print = false;
                        break;
                    }
                }else{
                    try{
                    total /= Integer.parseInt(matcher.group().trim());
                    } catch(NumberFormatException ei){
                        System.out.println( matcher.group().trim() + " no esta definido");
                        print = false;
                        break;
                    }
                }
            }catch (ArithmeticException e) {
                // Exception handler
                System.out.println(
                    "divicion entre 0");
                print = false;
                break;

            }

        }
            if(print){
            System.out.println(total);
            }
        }
    }
}