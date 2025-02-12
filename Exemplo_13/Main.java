package Exemplo_4;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        pessoa.idade = 18;

        if (pessoa.eMaiorDeIdade()) {
            System.out.println("É maior de idade");
        }
    }
}
