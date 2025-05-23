
Anotações | Java Básico | Curso em Vídeo
---
Orientada a Objeto

	Java é uma linguagem de Programação Orientada a Objetos. Isso significa que em Java tudo é escrito em termos de Classes e Objetos
Para começar a desenvolver softwares de forma consistente com Java, é necessário compreender os pilares da Programação Orientada a Objetos (POO). Eles são:

- Classe e Objeto 
- Encapsulamento
- Abstração 
- Herança
- Polimorfismo

IDE (Integrated Development Environment - Ambiente de Desenvolvimento Integrado)
     É um software que reúne várias ferramentas em um único lugar para ajudar programadores a escrever, testar e depurar (corrigir) seus códigos com mais facilidade
- VSCode
- Eclipse
     O que são workspaces?
     Definir JDK na IDE
     Criar / Abrir um Projeto Java
     Criar / importar um projeto Maven
     Conhecer os principais atalhos
     Code Snippet
     Executar / Depurar nosso programa
     Conhecer Alguns Atalhos
     
- Intelllij


JDK e JRE
-------
JDK e JRE são dois componentes fundamentais do ecossistema Java, e cada um tem uma função diferente:

---

### 🔹 **JRE (Java Runtime Environment)**

- **O que é:** Ambiente de execução para programas Java.
    
- **Serve para:** **Executar** aplicações Java já compiladas.
    
- **Componentes principais:**
    
    - JVM (Java Virtual Machine)
        
    - Bibliotecas padrão (Java Class Libraries)
        
- **Quem usa:** Usuários finais que só querem rodar um software feito em Java.
    

---

### 🔹 **JDK (Java Development Kit)**

- **O que é:** Kit de desenvolvimento Java.
    
- **Serve para:** **Desenvolver** e compilar programas Java.
    
- **Componentes principais:**
    
    - Tudo que tem no JRE (incluindo a JVM)
        
    - Compilador (`javac`)
        
    - Ferramentas de desenvolvimento (debug, monitoramento, etc.)
        
- **Quem usa:** Desenvolvedores Java.
    

---

### 🔁 Resumo da Relação:

📦 **JDK** = **JRE** + ferramentas de desenvolvimento  
💡 Ou seja, se você está **programando em Java**, precisa do **JDK**.  
Se só vai **rodar um programa**, o **JRE** já é suficiente (embora hoje em dia o JDK seja mais comum porque inclui tudo).

---

![[2025-05-12 18-54-56.mkv]]


### Download do JDK Java SE

Para aprender JAVA você precisa instalar um Kit de Desenvolvimento Java (JDK) e uma IDE. Para isso, deve instalar a versão à sua escolha. Existem várias opções no site da Oracle, indicamos aqui algumas versões encontradas no site oficial:  
OBS... Atualizamos o link da JDK, recomendamos que baixe a versão 15.0.2

  [![Download Grátis Java JDK](https://www.cursoemvideo.com/wp-content/uploads/2020/07/icone-dos-links2-150x150-1.png)  Download Grátis Java JDK](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html)  
  [![Download Grátis Java JRE](https://www.cursoemvideo.com/wp-content/uploads/2020/07/icone-dos-links2-150x150-1.png)  Download Grátis Java JRE](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)  
  [![JavaFX Scene Builder](https://www.cursoemvideo.com/wp-content/uploads/2020/07/icone-dos-links2-150x150-1.png)  JavaFX Scene Builder](http://www.oracle.com/technetwork/java/javafxscenebuilder-1x-archive-2199384.html)  
 

### Download NetBeans

Atualizamos o link para baixar o netbeans, recomendamos a versão 13.  
  [![NetBeans versão 13](https://www.cursoemvideo.com/wp-content/uploads/2020/07/icone-dos-links2-150x150-1.png)  NetBeans versão 13](https://www.apache.org/dyn/closer.cgi/netbeans/netbeans-installers/13/Apache-NetBeans-13-bin-windows-x64.exe)

Ficou na dúvida em qual desses pacotes baixar? Assista nossa aula sobre [Como Instalar o Java](https://youtu.be/yWU5bm_pZzY/ "Como Instalar o JDK") em seu computador. **Obs**: Você será redirecionado para o site oficial da ferramenta. O CursoemVideo não se responsabiliza pela disponibilidade dos arquivos em questão. Entretanto, caso o esteja fora do ar, pedimos que nos avise para mudarmos o link para não prejudicar seu estudo. Contamos com sua colaboração! **Obs**: No download do JavaFX Scene Builder, baixe a versão 2.0.

### Download dos SLIDES usados em Aula

Atendendo a pedidos, estamos disponibilizando os slides utilizados em cada aula em formato PDF. O uso desses slides é permitido em aulas, contanto que sejam mantidos os créditos ao autor. A cópia não autorizada desse material para outros fins poderá acarretar em processos judiciais.

  [![Slides Curso Java Grátis](https://www.cursoemvideo.com/wp-content/uploads/2020/07/icone-dos-links2-150x150-1.png)  Slides Curso Java Grátis](https://info.cursoemvideo.com/asset/1:slides-curso-java "Visualizar Apresentações")

### Manuais do JAVA

O JAVA é uma linguagem gratuita e muito bem documentada. Para efetuar o download da documentação completa da linguagem, acesse um dos links abaixo:

  [![Download Grátis Manuais do Java](https://www.cursoemvideo.com/wp-content/uploads/2020/07/icone-dos-links2-150x150-1.png)  Download Grátis Manuais do Java](https://www.oracle.com/technetwork/java/javase/documentation/jdk8-doc-downloads-2133158.html "Baixar os Manuais do JAVA")

**Importante**: A disponibilidade desses sites não depende do CursoEmVideo. Você será redirecionado para outro site externo. Entretanto, caso o esteja fora do ar, pedimos que nos avise para mudarmos o link para não prejudicar seu estudo. Contamos com sua colaboração!



Parte 2 (JavaFX e Swing)
------
public class TelaSwing extends (Herança) java.swing.JFrame {
	private (Encapsulamento) java.swing.JButton btnClick;
		private java.swing.JLabel lblMensagem;
	private void btnClickActionPerformed; {
		iblMensagem.setText ("...")
	}
}

implements (interface)
![[Screenshot (63).png]]


Parte 3 (Tipos Primitivos e Manipulação de Dados)
-----
Há 3 maneiras de fazer uma variavel do tipo inteiro dentro do Java são elas:
(
int (Typecast)
Integer(Wrapper Class)
)

- int idade = 3;
- int idade = (int) 3; int (Typecast)
- Integer idade = new Intager(3); Integer(Wrapper Class)

Tipo Real:
- float sal = 1825.45f
- float sal = (float) 1825.45;
- Float sal = new Float(1825.45);

Tipo Caractere:
- char letra = 'g';
- char letra = (char) 'g';
- Character letra = new Character ('G');

Tipo Lógico 
- boolean casado = false;
- boolean casado = (boolean) false;
- Boolean casado = new Boolean (false);

![[Screenshot (64).png]]


(%1f - e para adicionar uma casa decimal no seu resultado)
(\n - e para descer uma linha)
(parse - converter)
(método getter - pegar o valor que esta dentro ) - getText()
(método setter - colocar um valor dentro) - setText()
(
para dar entrada no seu codigo;
- para int utiliza-se - int idade = teclado.nextint()
- para float utiliza-se - float salario = teclado.nextFloat()
- para nome utiliza-se - String nome = teclado.nextLine()
)

Parte 4 (Operadores Aritméticos e Classe Math)
----

Operadores Aritméticos

| +   | Adição        | 5+2   | 10  |
| --- | ------------- | ----- | --- |
| -   | Subtração     | 5-2   | 3   |
| *   | Multiplicação | 5*2   | 10  |
| /   | Divisão       | 5 / 2 | 2.5 |
| %   | Resto         | 5%2   | 1   |

Operadores Unários

| ++  | Incremento | a ++ | a = a + 1 |
| --- | ---------- | ---- | --------- |
| --  | Decremento | a -- | a = a - 1 |

Operadores de Atribuição 

| +=  | Somar e Atribuir       | a += b | a = a + b   |
| --- | ---------------------- | ------ | ----------- |
| -=  | Subtrair e Atribuir    | a -= b | a = a - b   |
| *=  | Multiplicar e Atribuir | a *= b | a = a * b   |
| /=  | Dividir e Atribuir     | a /= b | a = a   / b |
| %=  | Resto e Atribuir       | a %= b | a = a % b   |

Classe Math

| PI   | Constante     | Math.PI       | 3.14 |
| ---- | ------------- | ------------- | ---- |
| pow  | Exponenciação | Math.pow(5,2) | 25   |
| sqrt | Raiz Quadrada | Math.sqrt(25) | 5    |
| cbrt | Raiz Cúbica   | Math.cbrt(27) | 3    |

Arredondamento

| abs   | Valor Absoluto            | Math.abs(-10)   | 10  |
| ----- | ------------------------- | --------------- | --- |
| floor | Arredondamento para Baixo | Math.floor(3.9) | 3   |
| ceil  | Arredondamento para Cima  | Math.ceil(4.2)  | 5   |
| round | Arredonda Aritmeticamente | Math.round(5.6) | 6   |
|       |                           |                 |     |
Gerador de Números 

| Math.random() |     |
| ------------- | --- |
|               |     |


Operadores Lógicos e Racionais
--------
Racionais

| >                                                    | Maior que        | 5>2  | true  |
| ---------------------------------------------------- | ---------------- | ---- | ----- |
| <                                                    | Menor que        | 4<1  | false |
| >=                                                   | Maior ou igual a | 8>=3 | true  |
| <=                                                   | Menor ou igual a | 6<=6 | true  |
| ==                                                   | Igual a          | 9==8 | false |
| !=                                                   | Diferente de     | 4!=5 | true  |
| para verificar se duas strings tem os mesmos valores | equals           |      |       |

Lógicos

| &&    | .E.   | true && false    | false |
| ----- | ----- | ---------------- | ----- |
| \| \| | .OU.  | false \| \| true | true  |
| ^     | .XOU. | true ^ true      | false |
| !     | .NAO. | ! false          | true  |


Estruturas Condicionais (Parte 1)
--------------------------
**|Estrutura|Sintaxe Exemplo|Descrição|

|Estrutura|Sintaxe Exemplo|Descrição|
|---|---|---|
|`if`|`if (condição) { // código }`|Executa o bloco **se** a condição for verdadeira.|
|`if-else`|`if (condição) { // código } else { // outro código }`|Executa um bloco **se** for verdadeiro, senão executa o outro.|
|`if-else if-else`|`if (cond1) { } else if (cond2) { } else { }`|Verifica várias condições em sequência.|
|`switch`|`switch (variável) { case valor1: ... break; default: ... }`|Escolhe entre vários **casos fixos**. Mais usado com `int`, `char`, `String`.|
|Operador Ternário|`variável = (condição) ? valorSeVerdadeiro : valorSeFalso;`|Forma curta de `if-else` para expressões simples.|


Estruturas Condicionais (Parte 2)
--------
| Palavra-chave | Função                                                           |
| ------------- | ---------------------------------------------------------------- |
| `switch`      | Avalia uma variável ou expressão.                                |
| `case`        | Representa cada valor possível da variável.                      |
| `break`       | Interrompe a execução para que não continue nos próximos `case`. |
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Dia inválido");
}


Estruturas de Repetição (Parte 1)
-------
| Situação                           | Use        |
| ---------------------------------- | ---------- |
| Não sabe quantas vezes vai repetir | `while`    |
| Precisa executar pelo menos 1 vez  | `do-while` |
| Sabe o número de repetições        | `for`      |
| Vai percorrer arrays/listas        | `foreach`  |
- `i++` → **pós-incremento** (incrementa depois de usar o valor)
    
- `++i` → **pré-incremento** (incrementa antes de usar o valor)


Estruturas de Repetição (Parte 2)
------
Serve para Criar uma Interface Grafica no seu Codigo

|Método|Para quê serve|
|---|---|
|`showInputDialog`|Entrada de dados do usuário|
|`showMessageDialog`|Mostrar uma mensagem simples|
|`showConfirmDialog`|Janela com opções (Sim, Não, Cancelar)|
|`showOptionDialog`|Mais personalização (ícones, botões)|

Vetores 
-------
Vetores é uma estrutura de dados que armazena multiplos valores do mesmo tipo, usando indice numericos

### 📌 Explicações rápidas:

| Termo            | Significado                                           |
| ---------------- | ----------------------------------------------------- |
| `int[]`          | Vetor de números inteiros                             |
| `numeros.length` | Tamanho do vetor                                      |
| `numeros[i]`     | Acessa o elemento da posição `i`                      |
| `for`            | Usado para percorrer o vetor                          |
| `for-each`       | Outra forma de percorrer (ex: `for(int n : numeros)`) |

Declarando Valores 
public class VetorExemplo {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // Vetor com 5 posições

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
    }
}



Declarando e Atribuindo Valores Direto
public class VetorSimples {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Duda"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + i + ": " + nomes[i]);
        }
    }
}


Usando Scanner para preencher o vetor com entrada do Usuário 
import java.util.Scanner;

public class VetorComScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("Você digitou:");
        for (int num : numeros) {
            System.out.println(num);
        }

        input.close();
    }
}

Metódos
---------
### 🧩 **Tabela: Tipos de Métodos em Java**

| Tipo                             | Recebe Parâmetro? | Retorna Valor? | Exemplo de Declaração                         | Exemplo de Uso                       | Descrição                                                             |
| -------------------------------- | ----------------- | -------------- | --------------------------------------------- | ------------------------------------ | --------------------------------------------------------------------- |
| **Sem parâmetros e sem retorno** | ❌ Não             | ❌ Não          | `public static void saudacao()`               | `saudacao();`                        | Apenas executa algo (ex: imprimir mensagem), sem entrada nem retorno. |
| **Com parâmetro e sem retorno**  | ✅ Sim             | ❌ Não          | `public static void mostrarNome(String nome)` | `mostrarNome("Ana");`                | Usa os dados fornecidos, mas não retorna nada.                        |
| **Com parâmetro e com retorno**  | ✅ Sim             | ✅ Sim          | `public static int somar(int a, int b)`       | `int r = somar(5, 10);`              | Recebe dados e retorna o resultado.                                   |
| **Sem parâmetro e com retorno**  | ❌ Não             | ✅ Sim          | `public static double gerarNumeroAleatorio()` | `double n = gerarNumeroAleatorio();` | Gera algo ou retorna um valor fixo, sem precisar de entrada.          |
