import java.util.Scanner;
  public class AugustoHenrique6
  {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double salar, aumen, salarAumen;
      
      System.out.print("Digite o valor referente ao salário do funcinário\n");
      salar = teclado.nextDouble();
      
      if (salar >= 700)
      {
      aumen = 0.10;
      salarAumen = salar * (1 + aumen);
      System.out.printf("O valor do salário do funcinário após o aumento é %.2f", salarAumen);
      }
      else      
      {
      aumen = 0.30;
      salarAumen = salar * (1 + aumen);
      System.out.printf("O valor do salário do funcinário após o aumento é %.2f", salarAumen);
      
      }
      
      teclado.close();
      }
   }