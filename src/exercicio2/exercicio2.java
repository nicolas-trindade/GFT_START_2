package exercicio2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        boolean flag = false, flag3 = false, flag6 = false, flag7 = false;

        while (flag == false){
            System.out.println("Digite um número: (não pode ser negativo ou 0)");
            numero = ler.nextInt();
            if (numero <= 0){
                System.out.println("Não pode número negativo ou zero");
            }
            else
                flag = true;
        }

        if ((numero % 3) == 0){
            flag3 = true;
        }
        if ((numero % 6) == 0){
            flag6 = true;
        }
        if ((numero % 7) == 0){
            flag7 = true;
        }
        if (flag3 == false && flag6 == false && flag7 == false){
            System.out.println("Não é divisivel por 3, 6 ou 7");
        }
        else {
            System.out.print("Divísivel por: ");
            if (flag3)
                System.out.print("3, ");
            if (flag6)
                System.out.print("6, ");
            if (flag7)
                System.out.print("7");
        }
    }
}
