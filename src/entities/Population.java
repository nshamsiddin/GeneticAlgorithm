package entities;

import java.util.LinkedList;
import java.util.List;

public class Population {
    private static final Integer chromosomesNumber = 5;
    private List<Chromosome> chromosomes;

    public Population(Integer size) {
        chromosomes = new LinkedList<>();
        for (int i = 0; i < chromosomesNumber; i++) {
            chromosomes.add(new Chromosome());
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("CreatureX:\n");
        for (Chromosome c : chromosomes) {
            result.append(c.toString());
        }
        result.append("\n");
        return result.toString();
    }

    public List<Chromosome> getChromosomes() {
        return chromosomes;
    }

    public void setChromosomes(List<Chromosome> chromosomes) {
        this.chromosomes = chromosomes;
    }

}
