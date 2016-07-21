package pengiun;

/**
 * Created by ddragan on 7/18/2016.
 */
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Random;

/**
 * Class for creating Penguins at your discretion
 *
 */
public class PenguinHatchery {
    private Random rand;
    private char [] letters;
    private List<PenguinRace> penguinRaces = Arrays.asList(PenguinRace.values());
    private int numberOfRaces = penguinRaces.size();

    /*
    functie care genereaza o lista de maxim 3 pinguini random
     */
    public List<Penguin> generateParteners(){
        Random rd = new Random();
        List<Penguin> parteners = new ArrayList<>();
        PenguinHatchery ph = new PenguinHatchery();

        //generare nr random intre 0 si 3
        int nr = rd.nextInt(3) + 1;

        for (int i = 0 ; i < nr ; i++){
            parteners.add(ph.hatchPenguin());
        }

        return parteners;
    }

    public PenguinHatchery() {
        rand = new Random();
        StringBuilder sb = new StringBuilder();
        for(char c= 'a' ; c <= 'z' ; c++){
            sb.append(c);
        }
        letters = sb.toString().toCharArray();
    }


    public Penguin hatchPenguin(){
        return new Penguin("pingu-"+generateString(5),
                penguinRaces.get(rand.nextInt(numberOfRaces)),
                rand.nextDouble()*15);
    }

    /**
     * Generates a random string of the specified length
     * @param length - Length of the string being generated
     */
    private String generateString(int length){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i < length; i++){
            sb.append(letters[rand.nextInt(letters.length)]);
        }
        return sb.toString();
    }
}

