import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorMultiplica {

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Informe o primeiro valor da multiplicação: ");
                int num1 = teclado.nextInt();
    
                System.out.print("\nInforme o segundo valor multiplicador: ");
                int num2 = teclado.nextInt();
    
                int resultado = ErrorMultiplica.multiplicar(num1, num2);
    
                System.out.println("\nResultado: " + resultado);
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nInforme valores válidos para a Multiplicação!!!\n");
                teclado.next();
            }
        }

        System.out.println("FIM!");

        teclado.close();
    }
}
