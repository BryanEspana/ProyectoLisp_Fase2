
public class datos<T> {
    private T datox;
    public String nombre;
    
    public datos(T datox, String nombre){
        this.datox = datox;
        this.nombre = nombre;
    }

    public T getValue(){
        return datox;
    }
    
    /*
    regresa el tipo del valor contenido
    */
    public Class datoxType(){
        return datox.getClass();
    
    }

}
