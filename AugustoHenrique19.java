import java.util.Scanner;

public class AugustoHenrique19 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in, "ISO-8859-1");

        int cod;
        double val = 0, valTot, valDesc, qtd;

        System.out.print("Digite o código e a quantidade dos produtos\n");
        cod = scr.nextInt();
        qtd = scr.nextDouble();

        if (cod >= 1 && cod <= 40) {
            if (cod >= 1 && cod <= 10) {
            val = 10;
            } else if (cod >= 11 && cod <= 20) {
            val = 20;
            } else if (cod >= 21 && cod <= 30) {
            val = 30;
            } else {
            val = 40;
            }
            valTot = qtd * val;
            System.out.printf("O preço unitário do produto, segundo Tabela I é: %.2f\nPreço total da nota é: %.2f\n", val, valTot);

            if (valTot < 250) {
            valDesc = valTot * 0.95;
            } else if (valTot >= 250 && valTot <= 500) {
            valDesc = valTot * 0.90;
            } else {
            valDesc = valTot * 0.85;
            }
            System.out.printf("O valor da nota com desconto é %.2f\n", valDesc);
        } else {
            System.out.print("Código inválido");
        }
    }
}
  