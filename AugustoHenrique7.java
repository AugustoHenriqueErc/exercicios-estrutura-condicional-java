/*

*/

import java.util.Scanner;
  public class AugustoHenrique7 {
    public static void main(String []args) {

    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    int ano;
    double taxa, valTabCar, imp;

    System.out.print("Digite o ano de fabricação do carro e o seu valor de tabela\n");  
    ano = scr.nextInt();
    valTabCar = scr.nextDouble();

    if (ano <= 1990) {
    taxa = 0.01;
    imp = taxa * valTabCar;
    System.out.printf("O imposto a ser pago é: %.2f", imp);  
    }
    else {
    taxa = 0.015;
    imp = taxa * valTabCar;
    System.out.printf("O imposto a ser pago é %,2f", imp);  
    }  

    scr.close();  
    }
  }