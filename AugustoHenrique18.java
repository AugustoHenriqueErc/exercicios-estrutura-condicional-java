import java.util.Scanner;
   public class AugustoHenrique18
   {
      public static void main(String []args)
      {
         Scanner teclado = new Scanner(System.in, "ISO-8859-1");
         
         long cpf, dv1, dv2, d1, d2, d3, d4, d5, d6, d8,  d7, d9, v1, v2 ;
         
         
         System.out.printf("Digite o seu CPF\n");
         cpf = teclado.nextLong();
         
         v2 = cpf % 10;
         cpf = cpf / 10;
         v1 = cpf % 10;
         cpf = cpf / 10;
         d1 = cpf % 10;
         cpf = cpf / 10;
         d2 = cpf % 10;
         cpf = cpf / 10;
         d3 = cpf % 10;
         cpf = cpf / 10;
         d4 = cpf % 10;
         cpf = cpf / 10;
         d5 = cpf % 10;
         cpf = cpf / 10;
         d6 = cpf % 10;
         cpf = cpf / 10;
         d7 = cpf % 10;
         cpf = cpf / 10;
         d8 = cpf % 10;
         cpf = cpf / 10;
         d9 = cpf % 10;
         cpf = cpf / 10;
         
         dv1 = (d1 * 2) + (d2 * 3) + (d3 * 4) + (d4 * 5) + (d5 * 6) + (d6 * 7) + (d7 * 8) + (d8 * 9) + (d9 * 10); 
                         
            if (dv1 % 11 <2){
            dv1 = 0;
            }
            else{
            dv1 = 11 - dv1 % 11; 
            }
         
         dv2 = (dv1 * 2) + (d1 * 3) + (d2 * 4) + (d3 * 5) + (d4 * 6) + (d5 * 7) + (d6 * 8) + (d7 * 9) + (d8 * 10) + (d9 * 11);
         
            if (dv2 % 11 < 2){
            dv2 = 0; 
            }
            else{
            dv2 = 11 - dv2 % 11;
            }
         
            if(dv1 == v1 && dv2 == v2){
            System.out.print("O cpf é Válido");
            }
            
            else{
            System.out.print("O cpf é INVALIDO");
            }
            
         teclado.close();
         }
   }