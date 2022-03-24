public class datos<T> {
    private T datox;
    public String name;
    
    public datos(T datox, String name){
        this.datox = datox;
        this.name = name;
    }
    /*
    regresa el tipo del valor contenido
    */
    public Class datoxType(){
        return datox.getClass();
    
    }
    public T getValue(){
        return datox;
    }
    
}
