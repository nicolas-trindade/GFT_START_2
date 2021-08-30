package exercicio1;

public class Gato extends Animal{

    public Gato(String nome, int peso) {
        super(nome, peso);
    }
    int racao;

    @Override
    public void som() {
        System.out.println(this.getNome()+" está miando: MIAU! MIAU!");
    }

    @Override
    public void quantidadeDeRacao() {
        if (this.getPeso() <= 3){
            racao += this.getPeso() * 10;
            System.out.println(this.getNome()+" consome "+(this.getPeso() * 10)+ "g de ração por dia");
        }
        else if (this.getPeso() > 3 ){
            racao += this.getPeso() * 13;
            System.out.println(this.getNome()+" consome "+(this.getPeso() * 13)+ "g de ração por dia");
        }
    }
    public int racaoTotal() {
        if (this.getPeso() <= 3){
            racao = this.getPeso() * 10;
        }
        else if (this.getPeso() > 3 ){
            racao = this.getPeso() * 13;
        }
        return racao;
    }
}
