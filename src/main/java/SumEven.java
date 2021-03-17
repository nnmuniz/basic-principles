import java.util.Scanner;

public class Sum_Even {
    public static void main(String[] args) {
        int total = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite um numero ");
            int numero = teclado.nextInt();
            if ((numero % 2 != 0)) {
                total = total + numero;
            }
        }
        System.out.println("A Soma dos numeros impares é: " + total);
    }
}