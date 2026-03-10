package exe1_1;

/**
 *
 * @author fabia
 */
public class Livro {
    private int id;
    private String titulo;
    private ECategoria categoria;
    private String autor;
    private String data;

    public enum ECategoria {
        DIDATICO,
        INFANTIL,
        FICCAO,
        AUTO_AJUDA
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
