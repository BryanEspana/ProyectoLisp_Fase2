/*
    Proyecto Fase #2 - Implementación de Lisp en Java
    Catedratico: Moises Alonso
    Auxs: Cristian Laynez y Rudik Rompich
    Integrantes:
        Angel Figueroa -21298
        Bryan España - 21550
        Javier Prado - 21486
*/
public class datos<T> {
    private T datox;
    public String nombre;
    //Le da nombre a las dos variables
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
