import java.io.IOException;
import java.net.CookieHandler;
import java.util.Date;

/**
 * Created by ddragan on 7/27/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Comment com = new Comment();
        ClientWorker clientWorker = new ClientWorker();

        com.setId(1);
        com.setEmail("dany_good_94@yahoo.com");
        com.setComment("Primul Comentariu");
        com.setName("Daniela");

        try {
            clientWorker.save(com);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Comment com2 = new Comment();

        com2.setId(2);
        com2.setEmail("en_daniela@endava.com");
        com2.setName("Dana");
        com2.setComment("Al doilea comentariu");

        clientWorker.save(com2);

        Comment com3 = new Comment();

        com3.setId(2);
        com3.setEmail("en@endava.com");
        com3.setName("Dana");
        com3.setComment("Al doilea comentariu");

        Comment c = clientWorker.findById((long) 2);
        System.out.println(c);

        clientWorker.delete((long) 1);
    }
}
