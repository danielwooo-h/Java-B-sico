package operadoreslogicoserelacionais;

public class operadoreslogicos {

    public static void main(String[] args) {
        int n1, n2;
        n1 = 200;
        n2 = 350;
        
        boolean r = (n1 > 100) && (n2 > 100);

        System.out.println("Ambos são maiores que 100? " + r);
    }
}
