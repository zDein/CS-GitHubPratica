import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    private int[] vetor = new int[10];
    private int count = 0;

    public void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite um número inteiro (0 para parar):");
                int numero = scanner.nextInt();

                vetor[count] = numero;
                count++;

                if (numero == 0) {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Você digitou mais de 10 valores.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Você digitou um valor que não é numérico.");
                scanner.next(); // limpa o buffer do scanner
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