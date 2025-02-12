import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diz me um numero");
        int n1 = scanner.nextInt();

        int resto = n1%2;

        if(resto == 1){
            System.out.println("O numero "+n1+" é impar");
        }else{
            System.out.println("O numero "+n1+" é par");
        }
    }
}
