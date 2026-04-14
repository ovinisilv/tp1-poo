package tp1;


public class Usuario{
    private String nome;
    private int idade;
    private String filme_alugado;

    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.filme_alugado = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFilme_alocado() {
        return filme_alugado;
    }

    public void setFilme_alugado(String filme_alugado) {
        this.filme_alugado = filme_alugado;
    }
    
    public void monstrar_usuario(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if(filme_alugado != null){
            System.out.println("Filme: " + filme_alugado);
        } else{
            System.out.println("Nenhum filme alugado.");
        }
    }
}

