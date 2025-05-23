package vetores;

public class vet1{
    
    public static void main(String[] args) {
        int[] v = new int[4];
   

        v [1] = 40;
        v [2] = 50;
        v [3] = 60;
        v [4] = 70;

            int sorteado = (int) (Math.random() *4);

        System.out.println("O Numero Aleatorio de 1 a 4 Gerado foi" + (sorteado + 1));
        System.out.println("O Numero do Vetor Gerado foi" + v[sorteado]);
    }
}
