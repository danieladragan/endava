import java.io.*;

/**
 * Created by ddragan on 7/19/2016.
 */
public class ReverseWords {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(
                    "C:\\Users\\ddragan\\IdeaProjects\\NumberLetters\\src\\in.in"));
            bw = new BufferedWriter(new FileWriter(
                    "C:\\Users\\ddragan\\IdeaProjects\\NumberLetters\\src\\out.out"));

            String line;
            String[] toPrint = new String[200];
            for (int i = 0 ; i < 200 ; i++) {
                toPrint[i] = "";
            }
            int k = 0;
            while ((line = br.readLine()) != null){
                String[] words = line.split(" ");

                for (int i = words.length - 1; i >= 0; i-- ) {
                    toPrint[k] += words[i] + " ";
                }
                toPrint[k] += "\n";

                k ++;
            }

            for (int i = k - 1 ; i >= 0 ; i--)
                bw.write(toPrint[i]);



        }catch (FileNotFoundException e) {
            System.out.println("File not found exception " + e.getMessage());
        }catch (IOException e){
            System.out.println("I/O Exception " + e.getMessage());
        } finally {
            try{
                if (br != null)     br.close();
                if (bw != null)     bw.close();
            } catch (IOException e){
                System.out.println("I/O Exception 2 " + e.getMessage());
            }
        }

    }
}
