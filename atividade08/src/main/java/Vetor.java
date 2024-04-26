import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    private int[] vetor = new int[10];
    private int count = 0;

    public void preencherVetor() {
        Scanner scanner = new Scanner(System.in);

    while (true) {
            System.out.println("Digite um número inteiro (0 para parar):");
            int numero = scanner.nextInt();

            vetor[count] = numero;
            count++;

            if (numero == 0) {
                break;
            }
        }
    }

    public void exibirVetor() {
        System.out.println("Valores do vetor:");
        for (int i = 0; i < count; i++) {
            System.out.println(vetor[i]);
        }
    }
}
