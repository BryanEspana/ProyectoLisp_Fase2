/*
    Proyecto Fase #2 - Implementación de Lisp en Java
    Catedratico: Moises Alonso
    Auxs: Cristian Laynez y Rudik Rompich
    Integrantes:
        Angel Figueroa -21298
        Bryan España - 21550
        Javier Prado - 21486
*/


public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controlador contr = new controlador();
        vista vista = new vista();
        vista.Menu();
        contr.imprimir();
        
    }
}
