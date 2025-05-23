package estruturascondicionais;

import java.util.Scanner;

public class parte1 {
    
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int p = Integer.parseInt(n1.nextLine());
        
        System.out.println("Digite outro número:");
        int l = Integer.parseInt(n1.nextLine());

        int r = (p + l )/4;

        
      if (p > 10) {
            System.out.println("Parabéns! O número " + p + " é maior que 10.");
        } else {
            System.out.println("Infelizmente, o número " + p + " é menor ou igual a 10.");
        }

      
    }
}
