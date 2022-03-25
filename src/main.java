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

/*
* CLASE PRINCIPAL DEL PROGRAMA, A TRAVES DE ESTA SE EJECUTA EL INTERPRETE
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
