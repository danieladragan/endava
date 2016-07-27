import java.io.IOException;
import java.net.CookieHandler;
import java.util.Date;

/**
 * Created by ddragan on 7/27/2016.
 */
public class Main {
    public static void main(String[] args) {
        Comment com = new Comment();
        ClientWorker clientWorker = new ClientWorker();

        com.setEmail("dany_good_94@yahoo.com");
        com.setId(1);
        com.setDate(new Date(14091994));
        com.setComment("Primul Comentariu");
        com.setName("Daniela");

        try {
            clientWorker.save(com);
            System.out.println("aici");
            clientWorker.save(com);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
