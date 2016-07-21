package pengiun;

/**
 * Created by ddragan on 7/18/2016.
 */
import com.sun.deploy.pings.Pings;

import java.util.*;

public class PenguinFun {

    private static List<Penguin> pen = new ArrayList<Penguin>();
    private static HashSet<Penguin> setPen = new HashSet<>();
    private static PenguinHatchery penHatchery = new PenguinHatchery();

    public static void main(String [] args) {
        //main class for testing your application

        /* exercitiul 1 */
        System.out.println("Exercitiul 1:");

        System.out.println("ArrayList");
        for (int i = 0 ; i < 10 ; i++)
            pen.add(penHatchery.hatchPenguin());

        for (Penguin p : pen)
            System.out.println(p);

        System.out.println("HashSet");
        for (int i = 0 ; i < 10 ; i++)
            setPen.add(penHatchery.hatchPenguin());

        for (Penguin p:setPen)
            System.out.println(p);

        //--------------------------------------------------------------------------------------------------------------

        /* exercitiul 2*/
        System.out.println("\n\nExercitiul 2:");

        /*
        ordonarea pinguinilor dupa rasa apoi dupa varsta
         */
        Collections.sort(pen, new Comparator<Penguin>() {
            @Override
            public int compare(Penguin o1, Penguin o2) {

                int res = o1.getRace().toString().compareTo(o2.getRace().toString());

                if (res == 0)
                {
                    return (int)(o1.getAge() - o2.getAge());
                }
                return res;
            }
        });

        System.out.println("Sortare 1");
        for (Penguin p : pen )
            System.out.println(p);
        System.out.println("Incheiere sortare");


        for (Penguin p : pen)
            p.setMatingPartners(penHatchery.generateParteners());

        for (Penguin p : pen )
            System.out.println(p);

        /*
        ordonare dupa numarul de parteneri, media varstelor pertenerilor si numele pinguinului initial
         */
        Collections.sort(pen, new Comparator<Penguin>() {
            @Override
            public int compare(Penguin o1, Penguin o2) {
                List<Penguin> partenersO1 = o1.getMatingPartners();
                List<Penguin> partenersO2 = o1.getMatingPartners();
                double avO1 = 0;
                int countO1 = partenersO1.size();
                double avO2 = 0;
                int countO2 = partenersO2.size();

                for (Penguin p : partenersO1){
                    avO1 += p.getAge();
                }
                avO1 /= countO1;


                for (Penguin p : partenersO2){
                    avO2 += p.getAge();
                }
                avO2 /= countO2;

                int res = countO1 - countO2;

                if (res == 0){
                    int res2 = (int) (avO1 - avO2);
                    if (res2 == 0)
                        return o1.getName().compareTo(o2.getName());

                    return res2;
                }

                return res;
            }
        });

        System.out.println("Sortare 2");
        for (Penguin p : pen )
            System.out.println(p);
        System.out.println("Incheiere sortare");


        //--------------------------------------------------------------------------------------------------------------


        /*
        exercitiul 3
         */
        System.out.println("Exercitiul 3");
        Map<PenguinRace, List<Penguin>> hashPen = new HashMap<>();

        for (Penguin p : pen){
                PenguinRace pr = p.getRace();
                List<Penguin> value = null;

                value = hashPen.get(pr);
            if (value == null){
                value = new ArrayList<Penguin>();
                value.add(p);
            }
            else
                value.add(p);

                hashPen.put(pr, value);
        }

        for (Map.Entry<PenguinRace, List<Penguin>> entry : hashPen.entrySet()) {
            PenguinRace key = entry.getKey();
            List<Penguin> value = entry.getValue();

            System.out.println("Rasa : " + key + "   ");
            if (value != null) {
                for (Penguin p : value)
                    System.out.print(p + " ");
            }
        }
    }
}

