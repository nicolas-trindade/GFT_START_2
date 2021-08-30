package exercicio1;

public class exercicio1 {
    public static void main(String[] args) {
        String linha = "------------------";
        int racaoTotal;

        Cachorro c1 = new Cachorro("Xereta", 13);
        Gato g1 = new Gato("Daphne", 20);
        Gato g2 = new Gato("Artemis", 3);
        Gato g3 = new Gato("Victor Hugo", 5);

        c1.som();
        c1.quantidadeDeRacao();
        System.out.println(linha);

        g1.som();
        g1.quantidadeDeRacao();
        System.out.println(linha);
        g2.quantidadeDeRacao();
        System.out.println(linha);
        g3.quantidadeDeRacao();
        System.out.println(linha);

        racaoTotal = c1.racaoTotal() + g1.racaoTotal() + g2.racaoTotal() + g3.racaoTotal();

        System.out.println("Quantidade de ração comida por todos os animais: "+racaoTotal+"g.");
    }
}
