import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Clase para la realizacion de operaciones aritmeticas
public class operadores{
    public void suma(String expresion, HashMap<String,datos> var){
        Integer total = 0;
        boolean print = true;
        Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
        Matcher Emp = patron.matcher(expresion);
    while (Emp.find()) {
            if(var.containsKey(Emp.group().trim())){
                if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
                total += (Integer) var.get(Emp.group().trim()).getValue();
                }else{
                    System.out.println("no hay operadores suficientes");
                    print = false;
                    break;
                }
            }else{
                try{
                total += Integer.parseInt(Emp.group().trim());
                } catch(NumberFormatException ei){
                    System.out.println(Emp.group().trim() + " No esta definida");
                    print = false;
                    break;
                }
            }
        
    }   if(print){
        System.out.println(total);
        }
    }
    
    
    public void resta(String expresion, HashMap<String,datos> var){
    Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
    Matcher Emp = patron.matcher(expresion);
    /*
    Usar el primer match como el valor inicial
    */
    Integer total = 0;
    boolean Continue = false;//en caso de no haber un match inicial se salta realizar la operacion
    if(Emp.find()){
        if(var.containsKey(Emp.group().trim())){
            if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
            total = (Integer) var.get(Emp.group().trim()).getValue();
            }else{
                System.out.println("no hay operadores suficientes");
                Continue = true;
            }
        }else{
            try{
            total = Integer.parseInt(Emp.group().trim());
            } catch(NumberFormatException ei){
                System.out.println( Emp.group().trim() + " no esta definido");
                Continue = true;
            }
        }
    }
       
    if(!Continue){
        boolean print = true;
        while (Emp.find()) {
                if(var.containsKey(Emp.group().trim())){
                    if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
                    total -= (Integer) var.get(Emp.group().trim()).getValue();
                    }else{
                        System.out.println("no hay operadores suficientes");
                        print = false;
                        break;
                    }
                }else{
                    try{
                    total -= Integer.parseInt(Emp.group().trim());
                    } catch(NumberFormatException ei){
                        System.out.println(Emp.group().trim() + " no esta definido");
                        print = false;
                        break;
                    }
                }

        }   if(print){
            System.out.println(total);
            }
        }
    }
    
    
    
    public void multiplicacion(String expresion, HashMap<String,datos> var){
    Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
    Matcher Emp = patron.matcher(expresion);
    Integer total = 1; //se coloca como 1 puesto que no interfiere con el resultado de multiplicar los numeros
    boolean print = true;
    while (Emp.find()) {
            if(var.containsKey(Emp.group().trim())){
                if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
                total *= (Integer) var.get(Emp.group().trim()).getValue();
                }else{
                    System.out.println("no hay operadores suficientes");
                    print = false;
                    break;
                }
            }else{
                try{
                total *= Integer.parseInt(Emp.group().trim());
                } catch(NumberFormatException ei){
                    System.out.println( Emp.group().trim() + " no esta definido");
                    print = false;
                    break;
                }
            }
        
    }   if(print){
        System.out.println(total);
        }
    }
    
    
    public void div(String expresion, HashMap<String,datos> var){
    Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
    Matcher Emp = patron.matcher(expresion);
    /*
    Usar el primer match como el valor inicial
    */
    Integer total = 0;
    boolean Continue = false;//en caso de no haber un match inicial se salta realizar la operacion
    if(Emp.find()){
        if(var.containsKey(Emp.group().trim())){
            if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
            total = (Integer) var.get(Emp.group().trim()).getValue();
            }else{
                System.out.println("no hay operadores suficientes");
                Continue = true;
            }
        }else{
            try{
            total = Integer.parseInt(Emp.group().trim());
            } catch(NumberFormatException ei){
                System.out.println( Emp.group().trim() + " no esta definido");
                Continue = true;
            }
        }
    }
    
    if(!Continue){
    boolean print = true;
        while (Emp.find()) {
            try{
                if(var.containsKey(Emp.group().trim())){
                    if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
                    total /= (Integer) var.get(Emp.group().trim()).getValue();
                    }else{
                        System.out.println("Operadores incompatibles");
                        print = false;
                        break;
                    }
                }else{
                    try{
                    total /= Integer.parseInt(Emp.group().trim());
                    } catch(NumberFormatException ei){
                        System.out.println(Emp.group().trim() + " no esta definido");
                        print = false;
                        break;
                    }
                }
            }catch (ArithmeticException e) {
                // Exception handler
                System.out.println(
                    "division entre 0");
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