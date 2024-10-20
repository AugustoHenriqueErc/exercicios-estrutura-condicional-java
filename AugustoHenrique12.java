import java.util.Scanner;
  public class AugustoHenrique12 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    double a, b, c;

    System.out.print("Digite os três lados de um triângulo\n");
    a = scr.nextDouble();
    b = scr.nextDouble();
    c = scr.nextDouble();

      if(Math.abs(b - c) < a && a < b + c && Math.abs(a - c) < b && b < a + c && Math.abs(a - b) < c && c < a + b){  
      System.out.printf("Os lados formam um triângulo");
    
        if(a == b && b == c) {
        System.out.printf("O triángulo é equilátero");
        }
        else if(a == b || b == c || a == c) {
        System.out.printf("O triângulo é isósceles");
        }
        else {
        System.out.print("O triângulo é escaleno");   
        }
      }  
      else {
      System.out.print("Os lados não formam um triângulo");
      }
  } 
}    