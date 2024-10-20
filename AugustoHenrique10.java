import java.util.Scanner;
  public class AugustoHenrique10 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");
      
    double  S, D, Q, n;
    
    System.out.print("Digite respectivamente, os valores de D e Q\n");
    D = scr.nextDouble();
    Q = scr.nextDouble();

    
  
      if(D > 100) {
      n = 2;
      S = (4 * Q ) / (3.14 * Math.pow(D,2)) * n;
      System.out.printf(" O valor da tensão S é %.2f", S);
      }
      else if(D < 50) {
      n = 6;
      S = (4 * Q ) / (3.14 * Math.pow(D,2)) * n;
      System.out.printf(" O valor da tensão S é %.2f", S);
      }
      else {
      n = 6;
      S = (4 * Q ) / (3.14 * Math.pow(D,2)) * n;
      System.out.printf(" O valor da tensão S é %.2f", S);
      }
    }  
  }