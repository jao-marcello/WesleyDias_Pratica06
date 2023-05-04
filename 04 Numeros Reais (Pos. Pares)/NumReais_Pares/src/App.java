import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }
        
        System.out.print("Elementos nas posições pares: ");
        for (int i = 0; i < numeros.length; i += 2) {
            System.out.print(numeros[i] + " ");
        }
    }
}