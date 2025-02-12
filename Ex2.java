import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diz me um numero");
        int n1 = scanner.nextInt();

        System.out.println("Diz me outro numero");
        int n2 = scanner.nextInt();

        if(n1>n2){
            System.out.println("O numero "+n1+" é maior que o numero "+n2);
        }else{
            System.out.println("O numero "+n2+" é maior que o numero "+n1);
        }
    }
}
