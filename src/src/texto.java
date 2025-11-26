import java.util.Scanner;

public class texto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Indique o tamanho do vetor");
        int N = ler.nextInt();
        int[] Vetor = new int[N];

        for (int i = 0; i<N; i++) {
            System.out.println("Indique os " + N + " números");
            Vetor[i] = ler.nextInt();
        }
    }
}