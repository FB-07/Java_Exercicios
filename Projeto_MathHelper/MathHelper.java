package Projeto_MathHelper;

public class MathHelper {

    public static int numeroSeguinte(int numero){
        return numero + 1;
    }

    public static String juntarNome(String nome, String apelido){
        return nome +" "+ apelido;
    }

    public static double maior(double[] numeros){
        double nmaior = 0;

        for(double numero:numeros){
            if(nmaior<numero){
                nmaior=numero;
            }
        }
        return nmaior;
    }

    public static double menor(double[] numeros){
        double nmenor = numeros[0];

        for(double numero:numeros){
            if(nmenor>numero){
                nmenor=numero;
            }
        }
        return nmenor;
    }

    public static double soma(double[] numeros){
        double nsoma = 0;

        for(double numero:numeros){
            nsoma+=numero;
        }

        return nsoma;
    }

    public static double media(double[] numeros, int quantnum){
        double soma = 0;

        for(double numero:numeros){
            soma+=numero;
        }

        return soma/quantnum;
    }

    public static double divisao(double numero1, double numero2){
        return numero1/numero2;
    }

    public static double multiplicacao(double numero1, double numero2){
        return numero1*numero2;
    }
}
