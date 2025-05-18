package operadoresaritmeticos;

import java.util.Scanner;

public class operadordesubtração {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um Número");
        int n1 = Integer.parseInt(entrada.nextLine());
        Scanner entrad = new Scanner(System.in);
        int n2 = Integer.parseInt(entrada.nextLine());

        int tot = n1 - n2;
        System.out.println("O Valor desta Operacao de Subtracao \n" + tot);
    }
}
