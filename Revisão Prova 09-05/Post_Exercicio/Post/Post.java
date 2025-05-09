package Post_Exercicio.Post;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String title;
    private String content;
    private int likes;

    private List<Comment> comments;

    public Post(String string, String string2, String string3, int i) {

    }

    public Post(Date momento, String title, String content, int likes) {
        this.momento = momento;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.comments = new ArrayList<>();
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment){
        if (!comments.contains(comment)) {
            comments.contains(comment);
        }
    }

    public void removeComment(Comment comment) {
        if (comments.contains(comment)) {
            comments.remove(comment);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes -");
        sb.append(sdf.format(momento) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment c : comments) {
            sb.append(c.getText());
            sb.append("\n");
        }

        return sb.toString();

    }

}
