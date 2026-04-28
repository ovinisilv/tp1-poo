public class Usuario {
    private String nome;
    private int idade;
    private String filme_alugado;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.filme_alugado = null;
    }

    public void setFilme_alugado(String filme) {
        this.filme_alugado = filme;
    }

    public String getFilme_alugado() {
        return filme_alugado;
    }

    public void mostrarUsuario() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Filme alugado: " + (filme_alugado != null ? filme_alugado : "Nenhum"));
    }
}
