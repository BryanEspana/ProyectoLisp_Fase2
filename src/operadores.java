
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* CLASE DE OPERADORES MATEMATICOS, SUMA, RESTA, MULTIPLICACION Y DIVISION
*/
public class operadores{
    
    /** 
     * @param expresion
     * @param var
     */
    public void suma(String expresion, HashMap<String,datos> var){
        Integer total = 0;
        boolean print = true;
        Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
        Matcher Emp = patron.matcher(expresion);
        while (Emp.find()) {
            if(var.containsKey(Emp.group().trim())){
                //verificar que sea un valor numerico
                if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){
                    total += (Integer) var.get(Emp.group().trim()).getValue();
                }
                else{
                    System.out.println("no hay operadores suficientes");
                    print = false;
                    break;
                }
            }
            else{
                try{
                    total += Integer.parseInt(Emp.group().trim());
                } 
                catch(NumberFormatException ei){
                    System.out.println(Emp.group().trim() + " No esta definida");
                    print = false;
                    break;
                }
            }
            
        }   
        if(print){
            System.out.println(total);
        }
    }
    
    /** 
     * @param expresion
     * @param var
     */
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
                //verificar que sea un valor numerico
                if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){
                    total = (Integer) var.get(Emp.group().trim()).getValue();
                }
                else{
                    System.out.println("no hay operadores suficientes");
                    Continue = true;
                }
            }
            else{
                try{
                total = Integer.parseInt(Emp.group().trim());
                } 
                catch(NumberFormatException ei){
                    System.out.println( Emp.group().trim() + " no esta definido");
                    Continue = true;
                }
            }
        }
       
        if(!Continue){
            boolean print = true;
            while (Emp.find()) {
                if(var.containsKey(Emp.group().trim())){
                    //verificar que sea un valor numerico
                    if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){
                        total -= (Integer) var.get(Emp.group().trim()).getValue();
                    }
                    else{
                        System.out.println("no hay operadores suficientes");
                        print = false;
                        break;
                    }
                }
                else{
                    try{
                        total -= Integer.parseInt(Emp.group().trim());
                    } 
                    catch(NumberFormatException ei){
                        System.out.println(Emp.group().trim() + " no esta definido");
                        print = false;
                        break;
                    }
                }

            }   
            if(print){
                System.out.println(total);
            }
        }
    }
    
    /** 
     * @param expresion
     * @param var
     */
    public void multiplicacion(String expresion, HashMap<String,datos> var){
        Pattern patron = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
        Matcher Emp = patron.matcher(expresion);
        Integer total = 1; //se coloca como 1 puesto que no interfiere con el resultado de multiplicar los numeros
        boolean print = true;
        while (Emp.find()) {
            if(var.containsKey(Emp.group().trim())){
                //verificar que sea un valor numerico
                if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){
                    total *= (Integer) var.get(Emp.group().trim()).getValue();
                }
                else{
                    System.out.println("no hay operadores suficientes");
                    print = false;
                    break;
                }
            }
            else{
                try{
                    total *= Integer.parseInt(Emp.group().trim());
                } 
                catch(NumberFormatException ei){
                    System.out.println( Emp.group().trim() + " no esta definido");
                    print = false;
                    break;
                }
            }
        
        }   
        if(print){
            System.out.println(total);
        }
    }
    
    /** 
     * @param expresion
     * @param var
     */
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
            //verificar que sea un valor numerico
                if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){
                total = (Integer) var.get(Emp.group().trim()).getValue();
                }
                else{
                    System.out.println("no hay operadores suficientes");
                    Continue = true;
                }
            }
            else{
                try{
                    total = Integer.parseInt(Emp.group().trim());
                } 
                catch(NumberFormatException ei){
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
                        //verificar que sea un valor numerico
                        if(var.get(Emp.group().trim()).datoxType().equals(Integer.class)){
                            total /= (Integer) var.get(Emp.group().trim()).getValue();
                        }
                        else{
                            System.out.println("Operadores incompatibles");
                            print = false;
                        break;
                        }
                    }
                    else{
                        try{
                            total /= Integer.parseInt(Emp.group().trim());
                        } 
                        catch(NumberFormatException ei){
                            System.out.println(Emp.group().trim() + " no esta definido");
                            print = false;
                            break;
                        }
                    }
                }
                catch (ArithmeticException e) {// Exception
                 
                    System.out.println("division entre 0");
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