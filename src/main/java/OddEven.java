import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1;

        System.out.println("Digite um número: ");
        n1 = input.nextInt();

        if(n1 % 2 == 0) {
            System.out.println("O numero " + n1 + " é par.");
        } else
            System.out.println("O numero " + n1 + " é impar.");
    }
}