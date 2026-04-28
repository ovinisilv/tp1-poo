import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locadora locadora = new Locadora();

        // Cadastro de filmes
        locadora.adicionarFilme(new Filme("Matrix", 10.0));
        locadora.adicionarFilme(new Filme("Batman", 12.0));
        locadora.adicionarFilme(new Filme("Vingadores", 15.0));

        // Criar usuário
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Usuario usuario = new Usuario(nome, idade);

        // Mostrar filmes
        locadora.mostrarFilmes();

        // Escolher filme
        System.out.print("Qual filme deseja alugar? ");
        String escolha = sc.nextLine();

        // Alugar
        locadora.alugarFilme(usuario, escolha);

        // Mostrar resultado
        usuario.mostrarUsuario();

        sc.close();
    }
}
