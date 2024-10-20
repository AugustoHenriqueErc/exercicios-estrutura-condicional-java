/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica, a porcentagem do distribuidor e os
impostos. O valor pago pela distribuição e dos impostos é calculado com base no custo de fábrica. As
porcentagens estão apresentadas na tabela abaixo. Faça um programa que receba o custo de fábrica de um
carro e mostre o custo ao consumidor
*/

import java.util.Scanner;
   public class AugustoHenrique3{
      public static void main(String []args){
      Scanner scr = new Scanner(System.in, "ISO-8859-1");

      double custoFinal, custoFabri, taxaDistr, taxaImpos;
      int taxa;

      System.out.print("Digite o preço de fábrica do veículo\n");
      custoFabri = scr.nextDouble();

         if(custoFabri <= 28000) {
         taxaDistr = 0.05;
         taxaImpos = 0;
         custoFinal = custoFabri * (1 + taxaDistr + taxaImpos);
         System.out.printf("O valor do veículo é: %.2f", custoFinal);   
         }   
         else if(custoFabri > 28000 && custoFabri <= 45000) {
         taxaDistr = 0.10;
         taxaImpos = 0.15;
         custoFinal = custoFabri * (1 + taxaDistr + taxaImpos);
         System.out.printf("O valor do veículo é: %.2f", custoFinal);
         }
         else{
         taxaDistr = 0.15;
         taxaImpos = 0.20;  
         custoFinal = custoFabri * (1 + taxaDistr + taxaImpos);
         System.out.printf("O valor do veículo é: %.2f", custoFinal);
         }    
      scr.close();  
      
      }
   }
      