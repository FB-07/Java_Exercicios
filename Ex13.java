import java.util.Scanner;

public class Ex13 {
    static class Pessoa{
        int idade;
        String nome;
        double altura;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();

        System.out.println("Por favor, insira o nome da pessoa: ");
        pessoa1.nome = scanner.nextLine();

        System.out.println("Por favor, insira a idade da pessoa: ");
        pessoa1.idade = scanner.nextInt();

        System.out.println("Por favor, insira a altura da pessoa: ");
        pessoa1.altura = scanner.nextDouble();

        if (pessoa1.idade >= 18) {
            System.out.println("O "+ pessoa1.nome +" tem "+ pessoa1.idade +" anos e tens "+ pessoa1.altura +" de altura! E é maior de idade.");
        } else {
            System.out.println("O "+ pessoa1.nome +" tem "+ pessoa1.idade +" anos e tens "+ pessoa1.altura +" de altura! E é menor de idade.");
        }
    }
}
