import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diz me um numero");
        int n1 = scanner.nextInt();

        System.out.println("Diz me outro numero");
        int n2 = scanner.nextInt();

        System.out.println("Diz me outro numero");
        int n3 = scanner.nextInt();

        int maior=0;
        int menor=0;
        int meio=0;

        if (n1 > n2) {
            if (n1 > n3) {
                maior = n1;
                if (n2 > n3) {
                    meio = n2;
                    menor = n3;
                } else {
                    meio = n3;
                    menor = n2;
                }
            }
        }

        if (n2 > n1) {
            if (n2 > n3) {
                maior = n2;
                if (n1 > n3) {
                    meio = n1;
                    menor = n3;
                } else {
                    meio = n3;
                    menor = n1;
                }
            }
        }

        if (n3 > n1) {
            if (n3 > n2) {
                maior = n3;
                if (n1 > n2) {
                    meio = n1;
                    menor = n2;
                } else {
                    meio = n2;
                    menor = n1;
                }
            }
        }

        System.out.println("O numero "+maior+" é maior que "+meio+" que é maior que o "+menor);

    }
}
