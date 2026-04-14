package tp1;
import java.util.ArrayList;



public class Locadora {
    private ArrayList<Filme> listaDeFilmes = new ArrayList<>();
    public void adicionarFilme(Filme f){
        listaDeFilmes.add(f);
    }

    public void mostrarFilmes(){
        for(Filme filmes:listaDeFilmes){
            System.out.println("Titulo: "+ filmes.getNomeFilme() + "| Preço: R$ " + filmes.getPreco());
        }
    }

}