public class Ex11 {

    public static int numeroSeguinte(int numero){
        return numero + 1;
    }

    public static String juntarNome(String nome, String apelido){
        return nome +" "+ apelido;
    }

    public static int maior(int[] numeros){
        int nmaior = 0;
        for(int numero:numeros){
            if(nmaior<numero){
                nmaior=numero;
            }
        }
        return nmaior;
        /*
        Arrays.sort(numeros);
        int max = numeros[numeros.length - 1];
        return max;
        Por ordem crenscente -1
        */
    }

    public static int soma(int[] numeros){
        int nsoma = 0;

        for(int numero:numeros){
           nsoma+=numero;
        }

        return nsoma;
    }

    public static double media(double[] numeros){
        int divisao = 0;
        double soma = 0;

        for(double numero:numeros){
            soma+=numero;
            divisao++;
        }

        return soma/divisao;
    }

    public static void main(String[] args) {
        int numero = 2;
        System.out.println("O numero seguinte é: "+numeroSeguinte(numero));

        String nome = "Fabio";
        String apelido = "Barros";
        System.out.println("O teu nome completo é: "+juntarNome(nome,apelido));

        int numeros[] ={5,5,5,4,6};
        System.out.println("O numero maior é: "+maior(numeros));
        System.out.println("A soma dos numeros é: "+soma(numeros));

        double virgula[] ={14.5,14.6,15.9,13.5,12.5};
        System.out.println("A media dos numeros é: "+media(virgula));
    }
}