package exercicio1;

public class Cachorro extends Animal{

    public Cachorro(String nome, int peso) {
        super(nome, peso);
    }

    int racao;
    @Override
    public void som() {
        System.out.println(this.getNome()+ " está latindo: AU! AU! AU!");
    }

    @Override
    public void quantidadeDeRacao() {
        if (this.getPeso() <= 4){
            racao += (this.getPeso() * 40);
            System.out.println(this.getNome()+" consome "+(this.getPeso() * 40)+ "g de ração por dia");
        }
        else if (this.getPeso() > 4 && this.getPeso() <= 12){
            racao += (this.getPeso() * 45);
            System.out.println(this.getNome()+" consome "+(this.getPeso() * 45)+ "g de ração por dia");
        }
        else if (this.getPeso() > 12){
            racao += (this.getPeso() * 55);
            System.out.println(this.getNome()+" consome "+(this.getPeso() * 55)+ "g de ração por dia");
        }

    }
    public int racaoTotal() {
        if (this.getPeso() <= 4){
            racao = (this.getPeso() * 40);
        }
        else if (this.getPeso() > 4 && this.getPeso() <= 12){
            racao = (this.getPeso() * 45);
        }
        else if (this.getPeso() > 12){
            racao = (this.getPeso() * 55);
        }
        return racao;
    }
}
