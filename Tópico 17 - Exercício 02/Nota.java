package nota;

import java.text.DecimalFormat;  
    import java.util.Scanner;  
      
    public class Nota {  
        public static void main(String[] args) {  
            Scanner input = new Scanner(System.in);  
            DecimalFormat df = new DecimalFormat("0.00");  
            System.out.println(".::Média do Aluno::.");  
            System.out.println("Insira as 3 notas do aluno:");  
            float a = input.nextFloat();  
            float b = input.nextFloat();  
            float c = input.nextFloat();
            float maior = a, menor1 = b, menor2 = c;
            float aux = 0;
            float media=0;
            
            
            if (menor1 > maior){
            	aux = menor1;
            	menor1 = maior;
        		maior = aux;
            }
            if (menor2 > maior){
            	aux = menor2;
            	menor2 = maior;
        		maior = aux;
        	}
            
            
            System.out.println("Maior: "+maior);
            System.out.println("Menor1: "+menor1);
            System.out.println("Menor2: "+menor2);
            System.out.println();
            
            
            media = (4*maior + 3*menor1 + 3*menor2)/10;
            
            
            System.out.println("Nota 1: "+a);
        	System.out.println("Nota 2: "+b);
        	System.out.println("Nota 3: "+c);
        	System.out.println("Media: "+df.format(media));
            
        	
            if (media >= 5f) {
            	System.out.println("Situação: Aprovado.");
            }
            else {  
              System.out.println("Situação: Reprovado.");  
            }
            
            input.close();  
        }
    }