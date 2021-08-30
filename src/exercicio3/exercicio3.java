package exercicio3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int multiplicando = 0, inicio = 0, fim = 0;
        boolean flag = false;
        Scanner ler = new Scanner(System.in);
        int intervalo;

        while (flag == false) {
            System.out.println("Digite um numero para ser o multiplicando (Não pode ser maior que 1500):");
            multiplicando = ler.nextInt();

            System.out.println("Digite um valor de inicio de intervalo: (Não pode ser maior que 1500 ou menor a 0)");
            inicio = ler.nextInt();

            System.out.println("Digite um valor de fim de intervalo: (Não pode ser maior que 1500 ou menor a 0)");
            fim = ler.nextInt();

            System.out.println("Multiplicando: "+multiplicando);
            System.out.println("Inicio do intervalo: "+inicio);
            System.out.println("Fim do intervalo: "+fim);
            intervalo = fim - inicio;

            if (multiplicando > 1500 || multiplicando < 0){
                System.out.println("Numero multiplicando não pode ser maior que 1500 ou menor que 0");
                //System.out.println("erro 1");
                System.exit(0);
            }
            else if (inicio > 1500 || inicio < 0) {
                System.out.println("o inicio do intervalo nao pode ser maior que 1500 ou menor que 0");
                //System.out.println("erro 2");
                System.exit(0);
            }
            else if (fim > 1500 || fim < 0){
                System.out.println("o fim do intervalo não pode ser maior que 1500 ou menor que 0");
               // System.out.println("erro 3");
                System.exit(0);
            }
            else if (intervalo > 9){
                System.out.println("Valor de intervalo não pode ser maior que 10");
                //System.out.println("erro 4");
                System.exit(0);
            }
            else if (inicio >= fim) {
                System.out.println("Valor de inicio deve ser maior que o de fim");
                //System.out.println("erro 5");
                System.exit(0);
            }else{
                flag = true;
            }

        }
        System.out.println("----------------");
        for (int i = inicio; i<=fim; i++){
            System.out.println(multiplicando + " x "+(i)+" = "+ (multiplicando * (i)));
        }
    }
}
