
import java.util.Scanner;

public class lisp {


    Scanner Scan = new Scanner(System.in);
    int num;

    public void fibonacciLisp(int n) {
    }
    public int pedirNumero(){
        System.out.println("Ingrese un numero");
        num = Scan.nextInt();
        return num;
    }
    

    public void menuLisp(){
        System.out.println("El numero que colocas se convertira en:\n-Serie Fibonacci\n-Factorial\n-De celsius a farengeint\n-De farengeint a celsius");
        
    }

    public void FarCel(){
        double resultadoFarcel = (int) ((num*1.8)+32);
        System.out.println(resultadoFarcel);
    }
    
}
