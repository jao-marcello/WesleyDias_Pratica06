import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
            
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }
        
        System.out.print("Vetor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("\nSoma dos números pares: " + somaPares);
    }
}