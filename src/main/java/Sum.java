import java.util.Scanner;

public class Sum {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int sum;

        System.out.println("Digite um número: ");
        n1 = input.nextInt();
        System.out.println("Digite um número: ");
        n2 = input.nextInt();
        sum = n1 + n2;

        System.out.println("Soma: " + sum);

    }
}
