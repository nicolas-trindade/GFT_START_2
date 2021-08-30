package exercicio4;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Pessoa p[] = new Pessoa[5];
        String nome, cargo;
        //int i = 0;
        int starter = 0, junior = 0, senior = 0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i <5; i++){
            System.out.println("Digite o nome da "+(i+1) +"° pessoa: ");
            nome = ler.next();
            System.out.println("Digite o cargo da "+(i+1) +"° pessoa: (Starter, Junior ou Senior)");
            cargo = ler.next();
            if (cargo.equalsIgnoreCase("Starter")){
                starter++;
            }
            else if (cargo.equalsIgnoreCase("Junior")){
                junior++;
            }
            else if (cargo.equalsIgnoreCase("Senior")){
                senior++;
            }
            else
                senior++;
        }

        System.out.println("Total de Pessoas");

        System.out.println("Starter: "+starter);
        System.out.println("Junior: "+junior);
        System.out.println("Senior: "+senior);
    }

}
