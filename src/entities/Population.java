/*
 * Here we are using Singleton pattern
 * */
package entities;
import java.util.LinkedList;
import java.util.List;

public class Population {
    private static final Integer POPULATION_SIZE = 10; // Defining the size of initial population
    private List<Individual> individuals;
    private static final Population INSTANCE = new Population(); // Creating static method to store instance of population

    private Population() { // constructor is made private so it is not allowed to create instance outside of class
        individuals = new LinkedList<>();
        for (int i = 0; i < POPULATION_SIZE; i++) {
            individuals.add(new Individual());
        }
    }

    public static Population getInstance() {
        return INSTANCE;
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
