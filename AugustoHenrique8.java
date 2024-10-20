import java.util.Scanner;
  public class AugustoHenrique8  {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");
    
    int x;
    double funx;
      
    System.out.print("Digite o valor de x\n");
    x = scr.nextInt();

      if(x <= 1) {
      funx = 1;
      System.out.printf("O valor de f(x) é %.2f", funx);
      }
       else if(x > 1 && x <= 2) {
      funx = 2;
      System.out.printf("O valor de f(x) é %.2f", funx);  
      }
      else if (x > 2 && x <= 3) {
      funx =  Math.pow(x,2);
      System.out.printf("O valor de f(x) é %.2f", funx);  
      }
      else {
      funx = Math.pow(x,3);
      System.out.printf("O valor de f(x) é %.2f", funx);
      }  
    }  
  }