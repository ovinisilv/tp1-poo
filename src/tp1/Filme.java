package tp1;

//fazer validacoes

class Filme {
  private String nomeFilme;
  private int preco;

  public Filme(String nome, int preco) {
      this.nomeFilme = nome;
      this.preco = preco;
  }


  public String getNomeFilme() {
      return nomeFilme;
  }

  public int getPreco() {
      return preco;
  }

  public void setNomeFilme(String nomeFilme) {
      this.nomeFilme = nomeFilme;
  }

  public void setPreco(int preco) {
      if (preco > 0){
          this.preco = preco;
      }

  }

}
