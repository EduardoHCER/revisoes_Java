package Post_revisado;

public class Comentario {

    //Atributos
    private String coment;

    // Construtor 
    public Comentario(String coment){
        this.coment = coment;
    }

    // Getter 
    public String getComent(){
        return coment;
    }

    // Setter
    public void setComent(String coment){
        this.coment = coment;
    }

    public void exibirComent(){
        System.out.println("[Comentário] " + getComent());
    }

}
