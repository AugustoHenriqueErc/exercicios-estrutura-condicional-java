/*
Faça um algoritmo que dado um número digitado pelo usuário mostre se o mesmo é par ou ímpar.
*/

import java.util.Scanner;
  public class AugustoHenrique2 {
    public static void main(String []args) {

    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    int num;

    System.out.print("Digite um número\n");
    num = scr.nextInt();

      //if(num == 0) {
      //System.out.print(" O número %d neutro");  
      //}
      if(num % 2 == 0) {
        switch(num) {
        case 
        System.out.printf("O número %d é par", num);
        }
        
      }
      else {
      System.out.printf("O número %d é impar", num);
      }
    scr.close();
    }
}