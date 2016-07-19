import java.io.*;

/**
 * Created by ddragan on 7/19/2016.
 */
public class ContentOfFolder {

    public static void main(String[] args) {
        File currentDir = new File("D:\\");
        printDirectors(currentDir);
    }

    public static void printDirectors(File currentDir){

        File[] files = currentDir.listFiles();

        for (File f : files){
            if (f.isDirectory()) {
                String name = f.getName();
                String path = f.getAbsolutePath();

                System.out.println(path);

                try {
                File nextFolder = new File(path);
                if (!path.equals(new String("D:\\$RECYCLE.BIN")) ||
                        !path.equals(new String("D:\\System Volume Information")))
                    printDirectors(nextFolder);
                } catch (NullPointerException e){}
            }


        }

    }
}
