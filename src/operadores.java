import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class operadores {
    
    /*
    *
    */    
    public void multi(String expresion, HashMap<String,datos> var){
        Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); 
        Matcher matcher = patron.matcher(expresion);
        Integer resultado = 1; 
        boolean print = true;
        while (matcher.find()) {
            if(var.containsKey(matcher.group().trim())){
                //verificar que sea un dato numerico
                if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){
                resultado *= (Integer) var.get(matcher.group().trim()).getValue();
                }
                else{
                    System.out.println("Operacion no permitida");
                    print = false;
                    break;
                }
            }
            else{
                try{
                resultado *= Integer.parseInt(matcher.group().trim());
                } 
                catch(NumberFormatException ei){
                    System.out.println( matcher.group().trim() + " no esta definida");
                    print = false;
                    break;
                }
            }
        
        }   
    if(print){
        System.out.println(resultado);
    }
    
    }  
    
    /*
    *
    */
    public void add(String expresion, HashMap<String,datos> var){
        Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
        Matcher Emp = patron.matcher(expresion);
        Integer resultado = 0;
        boolean print = true;
        while (Emp.find()) {
            if(var.containsKey(Emp.group().trim())){
                //verificar que sea un dato numerico
                if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){
                resultado += (Integer) var.get(Emp.group().trim()).getValue();
                    }else{
                        System.out.println("Operacion no permitida");
                        print = false;
                        break;
                    }
            }else{
                try{
                resultado += Integer.parseInt(Emp.group().trim());
                }catch(NumberFormatException ei){
                    System.out.println( Emp.group().trim() + " no esta definido");
                    print = false;
                    break;
                }
            }
            
        }if(print){
            System.out.println(resultado);
        }
    }

    /*
    *
    */
    public void quit(String expresion, HashMap<String,datos> var){
        Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
        Matcher matcher = patron.matcher(expresion);
        /* 
        * En este espacio se toma como valor inicial el operador de la operación 
        */
        // operador como valor inicial
        Integer resultado = 0;
        //como no hay un valor inicial, realizar la operacion enseguida
        boolean skip = false;
        if(matcher.find()){
            if(var.containsKey(matcher.group().trim())){
                //verificar que sea un dato numerico
                if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){
                    resultado = (Integer) var.get(matcher.group().trim()).getValue();
                }
            else{
                System.out.println("Operacion no permitida");
                skip = true;
            }
            }
        else{
            try{
                resultado = Integer.parseInt(matcher.group().trim());
            } 
            catch(NumberFormatException ei){
                System.out.println( matcher.group().trim() + " no esta definida");
                skip = true;
            }
        }
    }
        
    if(!skip){
        boolean print = true;
        while (matcher.find()) {
                if(var.containsKey(matcher.group().trim())){
                    //verificar que sea un dato numerico
                    if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){
                    resultado -= (Integer) var.get(matcher.group().trim()).getValue();
                    }
                    else{
                        System.out.println("Operacion no permitida");
                        print = false;
                        break;
                    }
                }
                else{
                    try{
                    resultado -= Integer.parseInt(matcher.group().trim());
                    } 
                    catch(NumberFormatException ei){
                        System.out.println( matcher.group().trim() + " no esta definida");
                        print = false;
                        break;
                    }
                }

        }   if(print){
            System.out.println(resultado);
            }
    }
    }
        
    /*
    *
    */   
    public void div(String expresion, HashMap<String,datos> var){
        Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
        Matcher matcher = patron.matcher(expresion);
        /* 
        * En este espacio se toma como valor inicial el operador de la operación 
        */
        Integer resultado = 0;
        //como no hay un valor inicial, realizar la operacion enseguida
        boolean skip = false;
        if(matcher.find()){
            if(var.containsKey(matcher.group().trim())){
                //verificar que sea un dato numerico
                if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){
                resultado = (Integer) var.get(matcher.group().trim()).getValue();
                }
                else{
                    System.out.println("Operacion no permitida");
                    skip = true;
                }
            }else{
                try{
                    resultado = Integer.parseInt(matcher.group().trim());
                } 
                catch(NumberFormatException ei){
                    System.out.println( matcher.group().trim() + " no esta definida");
                    skip = true;
                }
            }
        }
    
        if(!skip){
            boolean print = true;
            while (matcher.find()) {
                try{
                    if(var.containsKey(matcher.group().trim())){
                        if(var.get(matcher.group().trim()).datoxType().equals(Integer.class)){//ver que sea un numero
                        resultado /= (Integer) var.get(matcher.group().trim()).getValue();
                        }
                        else{
                            System.out.println("Operacion no permitida");
                            print = false;
                            break;
                        }
                    }else
                    {
                    try{
                        resultado /= Integer.parseInt(matcher.group().trim());
                        }   
                        catch(NumberFormatException ei){
                            System.out.println( matcher.group().trim() + " no esta definida");
                            print = false;
                            break;
                        }
                    }
                }
                catch (ArithmeticException AE) { // excepcion
                    System.out.println("Division por cero"); 
                    print = false;
                    break;

                }

            }
            if(print){
                System.out.println(resultado);
            }
        }
    }
}
