package Ex1;

import java.util.ArrayList;

/**
 * Clasa ce reprezinta o solutie partiala pentru problema de rezolvat. Aceste
 * solutii partiale constituie task-uri care sunt introduse in workpool.
 */
class PartialSolution {
    //datele unui task
    int begin = 0;
    int dim = 0;
    ArrayList<Integer> numbers = null;

    public PartialSolution(ArrayList<Integer> numbers, int begin, int dim) {
        this.numbers = numbers;
        this.begin = begin;
        this.dim = dim;
    }

    @Override
    public String toString() {
        return " Start " + begin + " dimensiune " + dim;
    }
}

