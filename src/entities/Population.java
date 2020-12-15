package src.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Population {

    private Integer populationSize;
    private List<Individual> individuals;
    
    //My code
    int fittest = 0;

    public Population(Integer size) {
        this.populationSize = size;
        individuals = new LinkedList<>();
        for (int i = 0; i < populationSize; i++) {
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



}
