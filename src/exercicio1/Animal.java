package exercicio1;

public abstract class Animal {
    protected String nome;
    protected int peso;

    public abstract void som();
    public abstract void quantidadeDeRacao();

    public Animal(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
