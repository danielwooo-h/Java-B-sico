package operadoresaritmeticos;

import java.util.Scanner;

public class operadordeadicao {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int n1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Digite outro número:");
        int n2 = Integer.parseInt(entrada.nextLine());
        
        int tot = n1 + n2;
        System.out.println("O total da operação de adição é: " + tot);
        
        entrada.close(); // boa prática: fechar o Scanner ao final
    }
}
