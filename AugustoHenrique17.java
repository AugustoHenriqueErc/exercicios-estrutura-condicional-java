import java.util.Scanner;
  public class AugustoHenrique17 {
      public static void main(String[] args) {
          Scanner scr = new Scanner(System.in);
          
          double num1, num2, num3, menor, meio, maior;
        
          System.out.println("Digite três números:");
          num1 = scr.nextDouble();
          num2 = scr.nextDouble();
          num3 = scr.nextDouble();
  
          if (num1 <= num2 && num1 <= num3) {
              menor = num1;
              if (num2 <= num3) {
                  meio = num2;
                  maior = num3;
              } else {
                  meio = num3;
                  maior = num2;
              }
          } else if (num2 <= num1 && num2 <= num3) {
              menor = num2;
              if (num1 <= num3) {
                  meio = num1;
                  maior = num3;
              } else {
                  meio = num3;
                  maior = num1;
              }
          } else {
              menor = num3;
              if (num1 <= num2) {
                  meio = num1;
                  maior = num2;
              } else {
                  meio = num2;
                  maior = num1;
              }
          }
          
          System.out.printf("Ordem crescente: %.2f, %.2f, %.2f\n", menor, meio, maior);
          System.out.printf("Ordem decrescente: %.2f, %.2f, %.2f\n", maior, meio, menor);
          }
  }