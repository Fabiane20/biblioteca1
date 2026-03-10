package exe1_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabia
 */
public class Biblioteca {

    private String nome;
    private List<Livro> acervo;//lista que armazena os livros da biblio

    public Biblioteca(String nome){
        this.nome = nome;
        acervo = new ArrayList<>();//cria lista vazia para armazenar os livros
    }

    public void addLivro(Livro l){//metodo pra add um livro no acervo
        acervo.add(l);//add livro
    }

    public void removerLivro(int id){//metodo para remover livro por id

        for(int i = 0; i < acervo.size(); i++){//for para percorrer os livros da lista

            if(acervo.get(i).getId() == id){//if pra verificar se o id removido é mesmo o informado
                acervo.remove(i);//se sim ele remove
                break;
            }
        }
    }

    public int verificaTotalLivros(){//metodo pra verificar a qauntidade total
        return acervo.size();
    }
        // listar livros
    public void listarLivros() {

        for (Livro l : acervo) {//percorrer todos os livros do acervo 

            System.out.println("ID: " + l.getId());//impressão dos dados do livro
            System.out.println("Título: " + l.getTitulo());
            System.out.println("Autor: " + l.getAutor());
            System.out.println("Categoria: " + l.getCategoria());
            System.out.println("----------------------");
        }
    }
}

