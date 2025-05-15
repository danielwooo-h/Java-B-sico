package tiposprimitivos;

import java.util.Scanner;

public class tiposprimitivoscharacter {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nomedigitado = entrada.nextLine();
        System.out.println("Prazer em te conhecer \n" + nomedigitado);
    }
}