import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locadora locadora = new Locadora();

        // cadastro de filmes
        locadora.adicionarFilme(new Filme("Matrix", 10.0));
        locadora.adicionarFilme(new Filme("Batman", 12.0));
        locadora.adicionarFilme(new Filme("Vingadores", 15.0));

        // criar usuário
        System.out.print("digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Usuario usuario = new Usuario(nome, idade);

        // mostrar filmes
        locadora.mostrarFilmes();

        // escolher filme
        System.out.print("escolha um filme para alugar ");
        String escolha = sc.nextLine();

        // alugar
        locadora.alugarFilme(usuario, escolha);

        // mostrar resultado
        usuario.mostrarUsuario();

        sc.close();
    }
}
