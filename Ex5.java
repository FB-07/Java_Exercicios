import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diz me um caracter");
        String c1 = scanner.nextLine();

        System.out.println("Diz me outro caracter");
        String c2 = scanner.nextLine();

        if(c1==c2){
            System.out.println("Os caracters "+c1+" e "+c2+" são igauois");
        }else{
            System.out.println("Os caracters "+c1+" e "+c2+" são diferentes");
        }
    }
}
