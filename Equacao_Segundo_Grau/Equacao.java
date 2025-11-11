package exercicos.Equacao_Segundo_Grau;

import java.util.Scanner;

public class Equacao {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int a, b, c;
        double delta, x1, x2;

        System.out.println("Informe o valor de a: ");
        a = leitor.nextInt();

        System.out.println("Informe o valor de b: ");
        b = leitor.nextInt();

        System.out.println("Informe o valor de c: ");
        c = leitor.nextInt();

        delta = Math.pow(b, 2) - 4 * a * c;

        if(delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Valor de X1: " + x1);
            System.out.println("Valor de X2: " + x2);
        } else {
            System.out.println("O valor de Delta foi negativo!");
        }




        leitor.close();
    }
}
