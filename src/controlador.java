/* 
    Hoja de Trabajo #6
    Bryan Carlos Roberto España Machorro - 21550
    Algoritmos y Estructura de Datos - Sección 10
    Catedratico: Moises Alonso
    Auxiliares:  Cristian Laynez y Rudik Rompich
*/

public class controlador {
    public void Programa(){
        vista vista = new vista();
        lisp lisp = new lisp();

        lisp.menuLisp();
        vista.Fibonacci();
        vista.Factorial();
        vista.CelsiusFareng();
        lisp.FarCel();
        vista.FarengCelsius();
    }
}
