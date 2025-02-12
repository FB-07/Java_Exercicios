import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, insira a sua idade: \n");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println(idade + " anos! És maior de idade.");
        } else {
            System.out.println(idade + " anos! És menor de idade.");
        }

        scanner.close();
    }
}
