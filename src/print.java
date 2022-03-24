public class print<T> {
    private T txt;
    public String nombre;
    //
    public print(T txt, String nombre){
        this.txt = txt;
        this.nombre = nombre;
    }
    //
    public Class txtType(){
        return txt.getClass();
    }
    //
    public T getValue(){
        return txt;
    }
}
