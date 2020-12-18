package factories.crossover;

import java.util.List;

import ent.individual.Individual;

/**
 * An actual implementation of the uniform crossover reproduction strategy for the reproduction phase.
 */
public class Uniform implements Crossover {

    // Abstract Factory's Factory method is a thread-safe Singleton class
    // via Double-checked locking
    private volatile static Uniform instance;

    // private constructor to avoid other classes to use constructor
    private Uniform() {
    }

    /**
     * @return Uniform
     */
    public static Uniform getInstance() {
        if (instance == null) {
            // The synchronized block of code now runs only once
            // when the singleton has not been created yet
            synchronized (Uniform.class) {
                if (instance == null) {
                    // Providing the singleton with a double checked locking initialization
                    instance = new Uniform();
                }
            }
        }
        // Return the singleton static instance
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