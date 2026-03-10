package exe1_1;

/**
 *
 * @author fabia
 */
public class Autor {
    private String nome;
    private int quantidadePublicacoes;

    public Autor(String nome) {
        this.nome = nome;
        this.quantidadePublicacoes = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadePublicacoes() {
        return quantidadePublicacoes;
    }

    public void adicionarPublicacao() {
        quantidadePublicacoes++;
    }
}
