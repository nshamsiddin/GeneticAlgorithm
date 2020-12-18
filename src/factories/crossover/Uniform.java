package factories.crossover;

import java.util.List;

import ent.individual.Individual;

/**
 * An actual implementation of the uniform crossover reproduction strategy for the reproduction phase.
 */
public class Uniform implements Crossover {

    // Abstract Factory's Factory method is a thread-safe Singleton class
    private static final Uniform instance = new Uniform();

    // private constructor to avoid other classes to use constructor
    private Uniform() {
    }

    /**
     * @return Uniform
     */
    public static Uniform getInstance() {
        return instance;
    }

    /**
     * @param individuals
     * @return List<Individual>
     */
    @Override
    public List<Individual> doCrossover(List<Individual> individuals) {
        System.out.println("Performing uniform crossover...");
        return individuals;
    }

}