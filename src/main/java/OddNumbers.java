//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        for (int i = 1; i <= num; i = i + 2) { //complete seu codigo aqui
            System.out.println(i);
        }
    }
}