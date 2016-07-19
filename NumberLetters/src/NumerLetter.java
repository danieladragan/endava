import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Created by ddragan on 7/19/2016.
 */
public class NumerLetter {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(
                    "C:\\Users\\ddragan\\IdeaProjects\\NumberLetters\\src\\in.in", "r");
            raf.seek(6L);

            //numarare cate litere de "d" avem

            int data;
            int nr = 0;
            while ((data = raf.read()) != -1){
                char dataChar = (char) data;
                if (dataChar == 'd' || dataChar == 'D')
                    nr ++;
            }
            System.out.println("Nr de d-uri : " + nr);

        }catch (FileNotFoundException e) {
            System.out.println("Fisierul nu este gasit :(");
        }catch (IOException e){
            System.out.println("Ce ai facut ma nene ma?");
        }finally {
            try {
                if (raf != null)
                    raf.close();
            } catch (IOException e) {
                System.out.println("I/O Exception " + e.getMessage());
            }
        }
    }

}
