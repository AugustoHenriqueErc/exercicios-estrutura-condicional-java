import java.util.Scanner;
  public class AugustoHenrique15
  {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      int binario, decimal, bit1, bit2, bit3, bit4;
      
      System.out.print("Digite um numero em binário com no máximo 4 bits\n:");
      binario = teclado.nextInt();
      
      bit1 = binario % 10;  
      binario = binario / 10;
      bit2 = binario % 10;
      binario = binario / 10;
      bit3 = binario % 10;
      binario = binario / 10;
      bit4 = binario % 10;
      binario = binario / 10;
      
      if ((bit1 == 0 || bit1 == 1) && (bit2 == 0 || bit2 == 1) && (bit3 == 0 || bit3 == 1) && (bit4 == 0 || bit4 == 1))
      {
      decimal = (int) (bit1 * Math.pow(2,0) + bit2 * Math.pow(2,1) + bit3 * Math.pow(2,2) + bit4 * Math.pow(2,3));
      System.out.print("O número digitado em binário é: " +decimal);
      }
      else 
      {
      System.out.print("O número digitado não é um número binário");
      }
      
      }
   }