package operadoresaritmeticos;

import java.util.Scanner;

public class operadordedivisaoeresto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um Número");
        double n1 = new Double(entrada.nextLine());
        Scanner entrad = new Scanner(System.in);
        System.out.println("Digite outro número");
        double n2 = new Double(entrada.nextLine());

        float tot = (float) (n1 / n2);
        System.out.println("O valor da Operacao de Divisao:" + tot );
        float tores = (float) (n1 % n2);
        System.out.println("O valor da Operacao de Resto da Divisão:" + tores);
    }
}
