import java.util.ArrayList;

/**
 * A class to represent a population.
 */
class Population {

    int size = 10; // for a population of size 10
    ArrayList<Chromosome> population = new ArrayList<Chromosome>();

    // No-arguments constructor. If called generates a
    // random population of Chromosomes.
    Population() {
        for (int i = 0; i < size; i++) {
            add(new Chromosome());
        }
    }

    void add(Chromosome anIndividual) {
        population.add(anIndividual); // an individual which will be a chromosome
    }

    @Override
    public String toString() {
        StringBuilder populationAsString = new StringBuilder();
        for (Chromosome c : population) {
            populationAsString.append(c.toString() + "\n");
        }
        return populationAsString.toString();
    }

    // for testing purposes
    public static void main(String[] args) {
        Population p = new Population();
        System.out.println(p);
    }
}