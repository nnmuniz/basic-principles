import java.util.Scanner;

public class Ignore_Comma {
    public static void main(String[] args) {

        String valor = "1,x,3,4,5,6,x,8,9,10";

        var root = valor.replace('x', ' ');
        root = valor.replace('x', ' ');
        System.out.println(root);

        var n1 = valor.replace('x', ' ');

        var teste = valor.replaceAll("x", "").replaceAll(",", "");
        System.out.println(teste);


        System.out.println(n1);
        n1 = valor.replace(',', ' ');
        System.out.println(n1);



            if (!n1.substring(3).matches("[0-9]*")) {
                valor = n1;
                System.out.println(valor);
            }
        }
}
