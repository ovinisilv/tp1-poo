public class Filme {
    private String nomeFilme;
    private double preco;

    public Filme(String nomeFilme, double preco) {
        this.nomeFilme = nomeFilme;
        this.preco = preco;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public double getPreco() {
        return preco;
    }
}
