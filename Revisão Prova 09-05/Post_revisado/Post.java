package Post_revisado;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    // Atributos.
    private Date momento;
    private String titulo;
    private String conteudo;
    private int likes;
    private List<Comentario> comentarios;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Post(){

    }

    public Post(Date momento, String titulo, String conteudo, int likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
        this.comentarios = new ArrayList<>();
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentario() {
        return comentarios;
    }

    public void addComentario(Comentario comentario) {
        if (!comentarios.contains(comentario)) {
            comentarios.add(comentario);
        }
    }

    public void removeComentario(Comentario comentario) {
        if (comentarios.contains(comentario)) {
            comentarios.remove(comentario); 
        }
    }

    public void exibirPost(){
        System.out.println("[Post]");
        System.out.println("Titulo: " + getTitulo() + ", " + getConteudo() + ", " + getLikes() + "\nData: " + sdf.format(getMomento()));
        System.out.println();
        System.out.println("[Comentários]");
        for (Comentario comentario : comentarios) {
            System.out.println(" - "+ comentario.getComent());
        }
    }
}
