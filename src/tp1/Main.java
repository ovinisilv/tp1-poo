package tp1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        Locadora minhaLocadora = new Locadora();


        System.out.println("---------- LOCADORA --------------");

        for(int i = 0; i < 3; i++) {
            System.out.println("Digite o Nome do Filme");
            String titulo = leitor.nextLine();

            System.out.println("Digite o preço do Filme");
            int preco = leitor.nextInt();

            leitor.nextLine();

            Filme novoFilme = new Filme(titulo, preco);
            minhaLocadora.adicionarFilme(novoFilme);

        }

        minhaLocadora.mostrarFilmes();


    }
}
