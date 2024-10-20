/*
Faça um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Faça os testes
necessários em relação a idade inválida.
*/

import java.util.Scanner;
  public class AugustoHenrique1{
    public static void main(String []args) {

    Scanner scr = new Scanner(System.in, "ISO-8859-1");
    
    int idade; 
    String categ;

    System.out.print("Digite a idade do competidor\n");
    idade = scr.nextInt();

      if(idade <= 0) {
      System.out.print("A idade do competidor é inválida"); 
      }
      else if(idade < 5) {
      System.out.print("O competidor é novo demais");
      }  
      else if (idade >= 5 && idade <= 7) {
      categ = "Infantil";
      System.out.printf("Categoria %s ", categ);
      }
      else if(idade > 7 && idade <= 10) {
      categ =  "Juvenil";
      System.out.printf("Categoria %s", categ);
      }
      else if(idade > 10 && idade <= 15) {
      categ = "Adolescente";
      System.out.printf("Categoria %s", categ);
      }  
      else if(idade > 15 && idade <= 40) {
      categ = "Adulto";
      System.out.printf("Categoria %s", categ);
      } 
      else {
      categ = "sênior";  
      System.out.printf("Categoria %s", categ);
      }
        
    scr.close(); 
    }
  }