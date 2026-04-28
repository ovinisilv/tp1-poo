import java.util.ArrayList;

public class Locadora {
    private ArrayList<Filme> listaDeFilmes = new ArrayList<>();

    public void adicionarFilme(Filme filme) {
        listaDeFilmes.add(filme);
    }

    public void mostrarFilmes() {
        System.out.println("filmes disponíveis:");
        for (Filme f : listaDeFilmes) {
            System.out.println("- " + f.getNomeFilme() + " | R$" + f.getPreco());
        }
    }

    public void alugarFilme(Usuario u, String nomeFilme) {
        for (Filme f : listaDeFilmes) {
            if (f.getNomeFilme().equalsIgnoreCase(nomeFilme)) {
                u.setFilme_alugado(f.getNomeFilme());
                System.out.println("filme alugado com sucesso");
                return;
            }
        }
        System.out.println("filme não encontrado.");
    }
}
