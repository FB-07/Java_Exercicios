package Projeto_MathHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MathHelper Helper = new MathHelper();

        int opcao;

        do{
            System.out.println("+-----------------------------+");
            System.out.println("|            Menu:            |");
            System.out.println("+-----------------------------+");
            System.out.println("|  1 - Numero Seguinte        |");
            System.out.println("|  2 - Juntar nome            |");
            System.out.println("|  3 - Media                  |");
            System.out.println("|  4 - Soma                   |");
            System.out.println("|  5 - Maior                  |");
            System.out.println("|  6 - Menor                  |");
            System.out.println("|  7 - Divisão                |");
            System.out.println("|  8 - Multiplicação          |");
            System.out.println("|  0 - Sair                   |");
            System.out.println("+-----------------------------+");
            System.out.print("Escolhe uma das opcões do menu: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //
            switch (opcao){
                case 1:
                    System.out.print("Introduz um numero: ");
                    int numSeguinte = scanner.nextInt();

                    System.out.println("O numero seguinte é: "+Helper.numeroSeguinte(numSeguinte));
                    break;
                case 2:
                    System.out.print("Introduz o teu nome: ");
                    String junNome = scanner.nextLine();

                    System.out.print("Introduz o teu apelido: ");
                    String junApelido = scanner.nextLine();

                    System.out.println("O nome completo é: "+Helper.juntarNome(junNome,junApelido));
                    break;
                case 3:
                    System.out.print("Quantos numeros queres introduzir: ");
                    int quantnummedia = scanner.nextInt();

                    double[] numeromedia = new double[quantnummedia];
                    for (int i = 0; i < quantnummedia; i++) {
                        int j=i+1;
                        System.out.print("Escreve o "+j+"ºnumero: ");
                        numeromedia[i] = scanner.nextDouble();
                    }

                    System.out.println("A media dos numeros é: "+Helper.media(numeromedia,quantnummedia));
                    break;
                case 4:
                    System.out.print("Quantos numeros queres somar: ");
                    int quantnumsoma = scanner.nextInt();

                    double[] numerosoma = new double[quantnumsoma];
                    for (int i = 0; i < quantnumsoma; i++) {
                        int j=i+1;
                        System.out.print("Escreve o "+j+"ºnumero: ");
                        numerosoma[i] = scanner.nextDouble();
                    }

                    System.out.println("A soma dos numeros é: "+Helper.soma(numerosoma));
                    break;
                case 5:
                    System.out.print("Quantos numeros queres introduzir: ");
                    int quantnum = scanner.nextInt();

                    double[] numero = new double[quantnum];
                    for (int i = 0; i < quantnum; i++) {
                        int j=i+1;
                        System.out.print("Escreve o "+j+"ºnumero: ");
                        numero[i] = scanner.nextDouble();
                    }

                    System.out.println("O maior numero é: "+Helper.maior(numero));
                    break;
                case 6:
                    System.out.print("Quantos numeros queres introduzir: ");
                    int quantnummenor = scanner.nextInt();

                    double[] numeromenor = new double[quantnummenor];
                    for (int i = 0; i < quantnummenor; i++) {
                        int j=i+1;
                        System.out.print("Escreve o "+j+"ºnumero: ");
                        numeromenor[i] = scanner.nextDouble();
                    }

                    System.out.println("O menor numero é: "+Helper.menor(numeromenor));
                    break;
                case 7:
                    System.out.print("Introduz um numero: ");
                    double numdiv = scanner.nextDouble();

                    System.out.print("Introduz mais numero: ");
                    double numdiv2 = scanner.nextDouble();

                    System.out.println("A divisão desses numeros é: "+Helper.divisao(numdiv,numdiv2));
                    break;
                case 8:
                    System.out.print("Introduz um numero: ");
                    double nummult = scanner.nextDouble();

                    System.out.print("Introduz mais numero: ");
                    double nummult2 = scanner.nextDouble();

                    System.out.println("A multiplicação desses numeros é: "+Helper.multiplicacao(nummult,nummult2));
                    break;
                case 0:
                    char sair;
                        do {
                            System.out.print("Queres mesmo sair do programa(y/n): ");
                            sair = scanner.next().charAt(0);

                            if (sair == 'y' || sair == 'Y') {
                                System.out.println("A Sair...");
                                break;
                            } else if (sair == 'n' || sair == 'N') {
                                System.out.println("A voltar...");
                                opcao++;
                                break;
                            }else {
                                System.out.println("Valor invalido, tenta novamente");
                            }
                        }while (sair != 'y' || sair != 'Y' || sair != 'n' || sair != 'N');
                    break;
                default:
                    System.out.println("Valor invalido, tenta novamente");
                    break;
            }
        }while(opcao != 0);
    }
}
