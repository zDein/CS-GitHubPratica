import java.util.InputMismatchException;

public class Divisao {
    private double numero1;
    private double numero2;

    public Divisao(String numero1Str, String numero2Str){
        try {
            this.numero1 = Double.parseDouble(numero1Str);
            this.numero2 = Double.parseDouble(numero2Str);
        } catch (NumberFormatException err){
            throw new InputMismatchException("Erro! Digite um número!");
        }
    }

    public void ResultadoDivisao(){
        try{
            if (this.numero2 == 0) {
                throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
            } else {
                System.out.println("Resultado da divisão: " + this.numero1 / this.numero2);
            }
        } catch(ArithmeticException | InputMismatchException e){
            System.err.println(e.getMessage());
        }
    }
}