import java.util.Scanner;
  public class AugustoHenrique16 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    int ano;

    System.out.print("Digite o ano desejado\n");
    ano = scr.nextInt();

      if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
      System.out.printf("O ano %d é bissexto", ano);  
      }
      else {
      System.out.printf("O ano %d não é bissexto", ano);
      }  
    }
  }