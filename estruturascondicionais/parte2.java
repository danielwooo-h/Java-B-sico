package estruturascondicionais;

import java.util.Scanner;

public class parte2 {
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite o seu Ano de Nascimento:");
        
        int nas = n.nextInt();
        int id = 2025 - nas;
        System.out.println("A sua idade é:" + id);

        if (id>18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade:");
        }



    }
}
