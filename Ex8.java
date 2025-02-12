import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor, insira o seu nome: \n");
        String nome = scanner.nextLine();

        System.out.println("Oá, "+nome+"! Bem-vindo ao mundo da programação em java!!");

        scanner.close();
    }
}
