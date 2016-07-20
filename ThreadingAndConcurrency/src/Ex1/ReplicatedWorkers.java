package Ex1;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;

public class ReplicatedWorkers {

    /*
    Functie care genereaza nume random intre 0 si 500
     */
    public static ArrayList<Integer> generateRandList(int nrElem) {
        Random rn = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0 ; i < nrElem ; i++) {
            Integer num = rn.nextInt(2000) + 1;
            numbers.add(num);
        }

        return numbers;
    }

    /*
    Functia main
     */
    public static void main(String args[]) throws InterruptedException {
        int NT = 4;
        int dim = 1000;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers = generateRandList(1000000);

     //   for (Integer i : numbers)
     //       System.out.print(i + "  ");


        WorkPool wp = new WorkPool(NT);

        for (int i = 0 ; i < numbers.size() ; i = i + dim){
            PartialSolution ps = new PartialSolution(numbers, i, dim);
            wp.putWork(ps);
        }

        Worker[] w = new Worker[NT];
        ArrayList<Integer> result = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0 ; i < NT ; i++) {
            w[i] = new Worker(wp, result);
            w[i].start();
        }

        for (int i = 0 ; i < NT ; i++) {
            w[i].join();
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);

        // afisare rezultat
        System.out.println("Rezultat:");
     //   for (Integer i : result)
     //       System.out.print(i + "  ");
    }

}
