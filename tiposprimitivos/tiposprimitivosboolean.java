package tiposprimitivos;

import java.util.Scanner;

public class tiposprimitivosboolean {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Cria um leitor de dados para do teclado
        
        System.out.print("Digite seu nome: ");
        String nomeDigitado = entrada.nextLine(); // Ler o que o usuario digita e guardar em uma variavel
        
        String nomeReal = "João"; // Altere aqui para seu nome verdadeiro
        boolean nomeEhVerdadeiro = nomeDigitado.equalsIgnoreCase(nomeReal); //equalsIgnoreCase é usado para comparar duas strings ignorando se e maiuscula ou minuscula 
        
        System.out.println("O nome digitado é verdadeiro? " + nomeEhVerdadeiro);
    }
}
