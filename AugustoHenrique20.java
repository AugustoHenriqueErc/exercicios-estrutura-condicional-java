import java.util.Scanner;
  public class AugustoHenrique20 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");
    
    char sexo;
    double altura, peso;

    System.out.print("Digite respectivamente a altura e o sexo do indivíduo\n");
    altura = scr.nextDouble();
    sexo = scr.next().charAt(0);

      if(sexo == 'M' || sexo == 'F') {
        
        if(sexo == 'M'){
        peso = (72.7 * altura) - 58;
        System.out.printf(" O peso ideal é %.2f", peso);
        }
        else{
        peso = (62.1 * altura) - 44.7;  
        
        System.out.printf(" O peso ideal é %.2f", peso);
        }
          
      }
      else {
      System.out.printf("O sexo digitado é inválido");  
      }  
    }
  }