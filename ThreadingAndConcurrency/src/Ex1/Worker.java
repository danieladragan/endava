package Ex1;

import java.util.ArrayList;

/**
 * Clasa ce reprezinta un thread worker.
 */
class Worker extends Thread {
    WorkPool wp;
    ArrayList<Integer> result = new ArrayList<>();

    public synchronized void addResult(Integer elem){
        result.add(elem);
    }

    public synchronized ArrayList addElement(PartialSolution ps) {
        ArrayList<Integer> part = new ArrayList<>();

        for (int i = ps.begin ; i < ps.begin + ps.dim ; i++){
            part.add(ps.numbers.get(i));
        }

        return part;
    }

    public Worker(WorkPool workpool, ArrayList<Integer> result) {
        this.wp = workpool;
        this.result = result;
    }

    boolean isPrime(Integer n) {
        for (int i = 2 ; i < n ; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    /**
     * Procesarea unei solutii partiale. Aceasta poate implica generarea unor
     * noi solutii partiale care se adauga in workpool folosind putWork().
     * Daca s-a ajuns la o solutie finala, aceasta va fi afisata.
     */
    void processPartialSolution(PartialSolution ps) {
        ArrayList<Integer> part = new ArrayList<>();

        part = addElement(ps);

        for (Integer i : part) {
            if (isPrime(i)){
                addResult(i);
            }
        }
    }

    public void run() {
     //   System.out.println("Thread-ul worker " + this.getName() + " a pornit...");
        while (true) {
            PartialSolution ps = wp.getWork();
            if (ps == null)
                break;

            processPartialSolution(ps);
        }
      //  System.out.println("Thread-ul worker " + this.getName() + " s-a terminat...");
    }


}