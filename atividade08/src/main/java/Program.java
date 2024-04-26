import java.util.Scanner;

public class Program {
    static void main(String[] args){

        Scanner input = new Scanner(System.in);

        var num1 = input.nextDouble();
        var num2 = input.nextDouble();

        Divisao divisao = new Divisao(Double.toString(num1), Double.toString(num2));

        divisao.ResultadoDivisao();

        input.close();
    }
}
