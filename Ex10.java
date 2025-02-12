import java.util.ArrayList;

public class Ex10 {
    public static int somaTodosElementos(ArrayList<Integer>lista) {
        int soma = 0;

        lista.size();

        /*for (int i = 0; i < lista.size(); i++) {
            soma += lista.size();
        }*/

        for (int numero:lista){
            soma+=numero;
        }

        return soma;
    }
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(5);

        System.out.println("A soma dos numeros na ArrayList é: "+somaTodosElementos(lista));
    }
}
