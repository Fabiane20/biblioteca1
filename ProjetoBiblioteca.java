package exe1_1;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class ProjetoBiblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //objeto scanner para ler do teclado
        Biblioteca b1 = new Biblioteca("Central");//biblio central

        int opcao;//var para guardar a option

        do {

            System.out.println("\n---- SISTEMA BIBLIOTECA -----");
            System.out.println("1 - Adicione um novo livro");
            System.out.println("2 - Remova um livro");
            System.out.println("3 - Ver quantidade total de livros");
            System.out.println("4 - Listar todos os livros");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt(); //le a option escolhida
            sc.nextLine(); //limpa buffer

            switch (opcao) {

                case 1:

                    Livro livro = new Livro(); //criar um novo object livro

                    System.out.print("ID: ");//solicita e define o id do livrp
                    livro.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Título: ");
                    livro.setTitulo(sc.nextLine());//solicita e define o titulo

                    System.out.print("Autor: ");
                    livro.setAutor(sc.nextLine());//solicita e define o autor

                    System.out.print("Data de publicação: ");
                    livro.setData(sc.nextLine());//solicta e define a data de publi

                    System.out.println("Categoria:");//categorias
                    System.out.println("1 - DIDATICO");
                    System.out.println("2 - INFANTIL");
                    System.out.println("3 - FICCAO");
                    System.out.println("4 - AUTO_AJUDA");

                    int cat = sc.nextInt();//le a categoria escolhida
                    sc.nextLine();

                    switch (cat) {
                        case 1:
                            livro.setCategoria(Livro.ECategoria.DIDATICO);
                            break;
                        case 2:
                            livro.setCategoria(Livro.ECategoria.INFANTIL);
                            break;
                        case 3:
                            livro.setCategoria(Livro.ECategoria.FICCAO);
                            break;
                        case 4:
                            livro.setCategoria(Livro.ECategoria.AUTO_AJUDA);
                            break;
                        default:
                            System.out.println("Categoria inválida! Livro não adicionado.");
                            continue;
                    }

                    b1.addLivro(livro);//add na biblio
                    System.out.println("Livro adicionado com sucesso!");

                    break;

                case 2://case pra remover livro

                    System.out.print("ID do livro para remover: ");
                    int id = sc.nextInt();//solicita o id do livro para ser removido
                    sc.nextLine();

                    b1.removerLivro(id);//removeee

                    break;

                case 3://case pra verificar o total de livros

                    System.out.println("Total de livros: " + b1.verificaTotalLivros());

                    break;

                case 4://case pra listar todos

                    b1.listarLivros();//lista tods

                    break;

                case 0://case de sair do sistema

                    System.out.println("Sistema encerrado.");

                    break;

                default://default para caso o user digite opção errada

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 0);//isso aqui é para que continue no menu até escolher uma option

        sc.close();//fecha o scannerr
    }
}