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

public class datos<T> {
    private T datox;
    public String nombre;
    //le asigna nombres a las variables
    public datos(T datox, String nombre){
        this.datox = datox;
        this.nombre = nombre;
    }
    
    /** 
     * @return T
     */
    //Regresa datox
    public T getValue(){
        return datox;
    }
    
    
    /** 
     * @return Class
     */
    //Regresa el valor
    public Class datoxType(){
        return datox.getClass();
    
    }

}
