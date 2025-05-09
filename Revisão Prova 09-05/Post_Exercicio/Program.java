package Post_Exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Post_Exercicio.Post.Comment;
import Post_Exercicio.Post.Post;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(sdf.parse("21/06/2018 09:28:30"), "Viagem para o Brasil", "Visitando este lugar lindo",
                12);

        Comment c1 = new Comment("Faça uma boa viagem!");
        Comment c2 = new Comment("Muito legal");

        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1.toString());

        Post post2 = new Post(sdf.parse("22/06/2018 21:30:30"), "Carro novo!", "Mostrando meu carro novo!", 30);

        Comment c3 = new Comment("Muito bonito seu carro novo.");
        Comment c4 = new Comment("Parabéns pelo carro!");

        post2.addComment(c3);
        post2.addComment(c4);

        System.out.println(post2.toString());

    }
}
