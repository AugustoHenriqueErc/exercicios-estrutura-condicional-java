import java.util.Scanner;
  public class AugustoHenrique5{
      public static void main(String []args){
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      char carac;
      
      System.out.print("Digite uma letra\n");
      carac = teclado.nextLine().charAt(0);
      
      if ((carac == 'a') || (carac == 'e') || (carac == 'i') || (carac == 'o') || (carac == 'u')) 
      {
      System.out.printf("A letra digitada é uma vogal");
      }  
      else 
      {
      System.out.printf("A letra digitada não é uma vogal");
      }
      //printar a vogal
      teclado.close();
      }
   }