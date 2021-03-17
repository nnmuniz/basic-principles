public class Fibonacci {
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }

//    Recursiva Utilizando o Operador Ternário
//    Com o uso do operador ternário do Java é possível construir uma implementação bem mais compacta do método recursivo.

    public static void main(String[] args) {

        // teste do programa. Imprime os 30 primeiros termos
        for (int i = 0; i < 7; i++) {
            System.out.print(Fibonacci.fibo(i) + "\t");
        }

    }
}
