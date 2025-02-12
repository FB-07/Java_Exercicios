package EX5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Carro carro = new Carro();

            System.out.print("Qual era a quilometragem inicial: ");
            int kminicio = scanner.nextInt();
            carro.setkm(kminicio);

            carro.SetAlugado(true);

            System.out.println("Quilometragem inicial: " + carro.getKm());
            System.out.println("Está alugado? " + carro.estaAlugado());

            System.out.print("Quantos quilometros andas-te: ");
            int kmdepois = scanner.nextInt();
            carro.adicionaKm(kmdepois);

            System.out.println("Quilometragem após entrega: " + carro.getKm());

            System.out.print("Queres continuar a alugar o carro?(true/false): ");
            boolean alugado = scanner.nextBoolean();
            carro.SetAlugado(alugado);

            System.out.println("\nQuilometragem final: " + carro.getKm());
            System.out.println("Ainda alugado? " + carro.estaAlugado());
        }
    }
