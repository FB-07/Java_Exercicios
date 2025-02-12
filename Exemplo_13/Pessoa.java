package Exemplo_4;

class Pessoa {
    String nome;
    int idade;

    public boolean eMaiorDeIdade() {
        if (this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
}