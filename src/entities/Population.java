package entities;

import java.util.LinkedList;
import java.util.List;

public class Population {

    private static final Integer polulationSize = 10;
    private List<Individual> individuals;

    public Population(Integer size) {
        individuals = new LinkedList<>();
        for (int i = 0; i < polulationSize; i++) {
            individuals.add(new Individual());
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        int i = 1;
        for (Individual in : individuals) {
            result.append("Individual " + i++ + ":\n");
            result.append(in.toString());
            result.append("\n");
        }
        return result.toString();
    }

    public List<Individual> getIndividuals() {
        return individuals;
    }

    public void setIndividuals(List<Individual> individuals) {
        this.individuals = individuals;
    }

	public void print() {
        System.out.println(this.toString());
	}

}
