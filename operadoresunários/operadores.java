package operadoresunários;

public class operadores {
    
    public static void main(String[] args) {
        /*
        int n1 = 3;
        n1++;
        System.out.println("O valor utilizando Operadores Unários é" + n1);
       
        
        int n1 = 4;
        n1--;
        System.out.println("O valor utilizando Operadores Unários é" + n1);
         

         int n1 = 5;
         n1 += 3;
         System.out.println("O valor utilizando Operadores de atribuicao é" + n1);


| +=  | Somar e Atribuir       | a += b | a = a + b   |
| --- | ---------------------- | ------ | ----------- |
| -=  | Subtrair e Atribuir    | a -= b | a = a - b   |
| *=  | Multiplicar e Atribuir | a *= b | a = a * b   |
| /=  | Dividir e Atribuir     | a /= b | a = a   / b |
| %=  | Resto e Atribuir       | a %= b | a = a % b   |



        float n1 = 5.8f;
         n1 = (float) Math.floor(n1);
        System.out.println("O valor utilizando Operadores de atribuicao é" + n1);

| abs   | Valor Absoluto            | Math.abs(-10)   | 10  |
| ----- | ------------------------- | --------------- | --- |
| floor | Arredondamento para Baixo | Math.floor(3.9) | 3   |
| ceil  | Arredondamento para Cima  | Math.ceil(4.2)  | 5   |
| round | Arredonda Aritmeticamente | Math.round(5.6) | 6   |
|       |                           |                 |     |
*/ 
        double ale = Math.random();
        int n1 = (int) (15 + ale * (100-20));
        System.out.println("O valor sorteado foi: " + n1);
    }
}
