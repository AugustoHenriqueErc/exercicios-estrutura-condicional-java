/*
4. Faça um programa que simule uma calculadora simples. Para isso, o usuário deverá entrar com dois
números quaisquer e a operação que deseja realizar: '+' soma; ' - ' subtração; ' * ' multiplicação e ' / '
divisão. Lembre-se das condições para realizar a divisão (condicional aninhada).
*/

import java.awt.DefaultFocusTraversalPolicy;
import java.util.Scanner;
  public class AugustoHenrique4 {
    public static void main(String []args) {

    Scanner scr = new Scanner(System.in, "ISO-8859-1");
    
    double num1, num2, opera; 
    int escol, escol2;

      System.out.print("Digite o primeiro número\n");
      num1 = scr.nextDouble();
      System.out.print("Digite o segundo número\n");
      num2 = scr.nextDouble();
      System.out.print("1_Soma\n2_Subtração\n3_Multiplicação\n4_Divisão\n");
      escol = scr.nextInt();

        if(num2 == 0 && escol == 4) {
        System.out.print("Indeterminado\n");  
        }
        else {
          switch(escol) {
            case 1:
              opera = num1 + num2;
              System.out.printf("%.2f\n", opera);
              break;
            case 2:
              opera = num1 - num2;
              System.out.printf("%.2f\n", opera);
              break;
            case 3:
              opera = num1 * num2;
              System.out.printf("%.2f\n", opera);
              break;
            case 4:
              opera = num1 / num2;
              System.out.printf("%.2f\n", opera);
              break;
            default:
              System.out.print("Digite uma operação válida!\n");
              break;
        }
      }
      System.out.print("Deseja fazer outra operação?\n1_Sim\n2_Não\n");
      escol2 = scr.nextInt();
      
      while (escol2 <= 1) {  
      System.out.print("Digite o primeiro número\n");
      num1 = scr.nextDouble();
      System.out.print("Digite o segundo número\n");
      num2 = scr.nextDouble();
      System.out.print("1_Soma\n2_Subtração\n3_Multiplicação\n4_Divisão\n");
      escol = scr.nextInt();
        
        if(num2 == 0 && escol == 4) {
        System.out.print("Indeterminado\n");  
        }
        else {
          switch(escol) {
            case 1:
              opera = num1 + num2;
              System.out.printf("%.2f\n", opera);
              break;
            case 2:
              opera = num1 - num2;
              System.out.printf("%.2f\n", opera);
              break;
            case 3:
              opera = num1 * num2;
              System.out.printf("%.2f\n", opera);
              break;
            case 4:
              opera = num1 / num2;
              System.out.printf("%.2f\n", opera);
              break;
            default:
              System.out.print("Digite uma operação válida!\n");
              break;
            
          }
          System.out.print("Deseja fazer outra operação?\n1_Sim\n2_Não\n");
          escol2 = scr.nextInt();
      }
    }
    }
  }