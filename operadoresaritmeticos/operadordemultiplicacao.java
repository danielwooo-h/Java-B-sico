package operadoresaritmeticos;

import java.util.Scanner;

public class operadordemultiplicacao {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um Número");
        double n1 = new Double(entrada.nextLine());
        Scanner entrad = new Scanner(System.in);
        double n2 = new Double(entrad.nextLine());

        float tot = (float) (n1 * n2);
        System.out.println("O Valor total desta Operacao de Multiplicacao:" + tot);
    }
}
