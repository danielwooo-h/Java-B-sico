package estruturasderepetição;

import java.util.Scanner;

public class parte3 {
    
    public static void main(String[] args) {
    int n, s=0;                  // Cria duas variáveis inteiras: 'n' para o número digitado e 's' para a soma, que começa em 0
    String resp;                 // Declara uma variável de texto para guardar a resposta do usuário (S ou N)

    Scanner teclado = new Scanner(System.in);  // Cria um objeto 'teclado' que vai permitir a leitura dos dados digitados

    do {
    System.out.println("Digite um Número:");   // Exibe a mensagem
    n = teclado.nextInt();                     // Lê o número digitado pelo usuário e guarda na variável 'n'

    s += n;                                    // Soma o valor digitado com a variável 's' (mesmo que: s = s + n)

    System.out.println("Deseja Continuar [S/N]");  // Pergunta se o usuário quer continuar
    resp = teclado.next();                        // Lê a resposta e guarda em 'resp'

}   while (resp.equals("S"));   // Enquanto o usuário digitar "S", o bloco repete tudo de novo

    System.out.println("A Soma de Todos os Valores é" + s);  // Quando o usuário digita "N", sai do laço e mostra o total

    }
    
}
