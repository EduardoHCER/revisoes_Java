package Post_revisado;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Post post1 = new Post (sdf.parse("08/10/2001 22:30"), "Viagem Bahamas", "Viagem Inesquecível", 9730);
        Comentario coment1 = new Comentario("Uau, incrível!");
        Comentario coment2 = new Comentario("Muito legal!");

        post1.addComentario(coment1);
        post1.addComentario(coment2);

        post1.exibirPost();
    }
}
