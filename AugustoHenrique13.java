import java.util.Scanner;
  public class AugustoHenrique13
  {
      public static void main(String []args)
      {
      Scanner scr = new Scanner(System.in, "ISO-8859-1");
      
      int num, cas1, cas2, cas3;
      
      System.out.print("Digite um numero \n:");
      num = scr.nextInt();
      
      cas1 = num % 10;  
      num = num / 10;
      cas2 = num % 10;
      num = num / 10;
      cas3 = num % 10;
      
      
      if (cas1 == cas3)
      {
      System.out.print("O número digitado é Palindromo");
      }
      else 
      {
      System.out.print("O número digitado não é um número Palindromo");
      }
      
      }
   }