import java.util.ArrayList;

/**
 * A class to represent a population.
 */
class Population {

    final int SIZE = 10; // for a population of size 10
    ArrayList<Individual> population = new ArrayList<Individual>();
    int populationCount; // for labelling each of the individuals

    // No-arguments constructor. If called generates a
    // random population of Chromosomes.
    Population() {
        for (int i = 0; i < SIZE; i++) {
            add(new Individual(populationCount += 1));
        }
    }

    void add(Individual anIndividual) {
        population.add(anIndividual);
    }

    @Override
    public String toString() {
        StringBuilder populationAsString = new StringBuilder();
        for (Individual i : population) {
            populationAsString.append(i.toString() + "\n");
        }
        return populationAsString.toString();
    }

    // for testing purposes
    public static void main(String[] args) {
        Population p = new Population();
        System.out.println(p);
    }
}