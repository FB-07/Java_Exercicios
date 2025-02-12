import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, insira a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Olá "+ nome +" tens "+ idade +" anos! És maior de idade.");
        } else {
            System.out.println("Ola "+ nome +" tens "+ idade +" anos! És menor de idade.");
        }
        scanner.close();
    }
}
