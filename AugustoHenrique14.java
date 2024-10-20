import java.util.Scanner;
  public class AugustoHenrique14 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    int ddd;

    System.out.print("Digite o DDD\n");
    ddd = scr.nextInt();

      if(ddd == 92 || ddd ==97) {
      System.out.print("O DDD pertence a Amazonas");  
      }
      else if (ddd == 71 || ddd > 73 && ddd <= 76 || ddd ==77) {
      System.out.print("O DDD pertence a Bahia");  
      }
      else if (ddd == 85 || ddd == 88){
      System.out.print("O DDD pertence a Ceará"); 
      }
      else if (ddd == 27 || ddd == 28) {
      System.out.print("O DD pertence a Espirito Santo");  
      }
      else if(ddd == 62 || ddd == 64) {
      System.out.print("O DDD pertence a Goiás");  
      }
      else if(ddd == 98 || ddd == 99) {
      System.out.print("O DDD pertence a Maranhão");    
      }
      else if(ddd == 65 || ddd == 66) {
      System.out.print("O DDD pertence a Mato Grosso");
      }
      else if(ddd == 31 && ddd <= 35 || ddd == 37) {
      System.out.print("O DDD pertence a Minas Gerais");
      }
      else if(ddd == 83 || ddd == 84) {
      System.out.print("O DDD pertence a Paraíba");
      }
      else if(ddd == 41 && ddd <= 46 ) {
      System.out.print("O DDD pertence a Paraná");
      }
      else if(ddd == 81 || ddd == 87) {
      System.out.print("O DDD pertence a Pernambuco");
      }
      else if(ddd == 86 || ddd == 89) {
      System.out.print("O DDD pertence a Piauí");
      }
      else if(ddd == 21|| ddd == 22 || ddd == 24) {
      System.out.print("O DDD pertence a Rio de Janeiro");
      }
      else if(ddd == 51|| ddd >= 53 && ddd <=55) {
      System.out.print("O DDD pertence a Rio Grande do Sul");
      }
      else if(ddd >= 47 && ddd <=49) {
      System.out.print("O DDD pertence a Santa Catarina");
      }
      else if (ddd == 11 && ddd <= 19) {
      System.out.print("O DDD pertence a Bahia");  
      }
      else{
        switch(ddd) {
          case 68:
            System.out.print("O DDD pertence ao Acre");
            break;
          case 82:
            System.out.print("O DDD pertence ao Alagoas");
            break;
          case 96:
            System.out.print("O DDD pertence ao Amapá");
            break;
          case 61:
            System.out.print("O DDD pertence ao Distrito Federal");
            break;
          case 67:
            System.out.print("O DDD pertence ao Mato Grosso do Sul");
            break;
          case 91:
            System.out.print("O DDD pertence ao Pará");
            break;
          case 69:
            System.out.print("O DDD pertence ao Rondônia");
            break;
          case 95:
            System.out.print("O DDD pertence ao Roraima");
            break;
          case 79:
            System.out.print("O DDD pertence ao Sergipe");
            break;
          case 63: 
            System.out.print("O DDD pertence ao Tocantins");
            break;
          default:
            System.out.print("DDD não cadastrado");
      
        }  
      }
    }
  } 
      
    
  