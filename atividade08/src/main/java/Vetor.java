import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    private int[] vetor = new int[10];
    private int count = 0;

    public void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
    }


    public void exibirVetor() {
        System.out.println("Valores do vetor:");
        for (int i = 0; i < count; i++) {
            System.out.println(vetor[i]);
        }
    }
}
