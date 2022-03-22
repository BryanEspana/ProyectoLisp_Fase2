
import java.util.Scanner;

public class lisp {

    Scanner Scan = new Scanner(System.in);

    public double num;
    public double Numero;
    public double formulaFar = 1.8;
    public void fibonacciLisp(int n) {
    }

    public void menuLisp(){
        System.out.println("El numero que colocas se convertira en:\n-Serie Fibonacci\n-Factorial\n-De celsius a farengeint\n-De farengeint a celsius");
        System.out.println("Coloca el numero:");
        Numero = Scan.nextInt();
    }

    public void FarCel(){
        Numero = num;
        double resultadoFarcel = (int) (num*1.8);
        System.out.println(resultadoFarcel);
    }
    
}
