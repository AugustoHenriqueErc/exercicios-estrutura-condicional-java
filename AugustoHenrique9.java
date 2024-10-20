import java.util.Scanner;
  public class AugustoHenrique9 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    double imc, alt, pes;

    System.out.print("Digite, respectivamente o peso (em quilogramas) a altura (em metros)\n");
    pes = scr.nextDouble();
    alt = scr.nextDouble();
    
    imc = pes / Math.pow(alt,2);
    
      if(imc < 18.5) {
      System.out.print("Abaixo do peso");   
      }  
      else if(imc > 18.5 && imc <= 25) {
        System.out.print("Peso normal");
      }  
      else if(imc > 25 && imc <= 30) {
      System.out.print("Acima do peso");
      }
      else {
      System.out.print("Obeso");
      }
    }  
    
  }