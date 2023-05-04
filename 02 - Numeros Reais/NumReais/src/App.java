import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        boolean temNegativo = false;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextDouble();
            
            if (numeros[i] < 0) {
                temNegativo = true;
                System.out.println("O número " + numeros[i] + " está na posição " + i);
            }
        }
        
        System.out.print("Vetor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        if (!temNegativo) {
            System.out.println("\nNão há números negativos no vetor");
        }
    }
}