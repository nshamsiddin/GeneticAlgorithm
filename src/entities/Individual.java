package entities;

import java.util.LinkedList;
import java.util.List;

public class Individual {
    private static final Integer chromosomesNumber = 2;
    private List<Chromosome> chromosomes;

    public Individual() {
        chromosomes = new LinkedList<>();
        for (int i = 0; i < chromosomesNumber; i++) {
            chromosomes.add(new Chromosome());
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Chromosome c : chromosomes) {
            result.append(c.toString());
            result.append("\n");
        }
        return result.toString();
    }

}
