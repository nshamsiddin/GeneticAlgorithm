package factories.crossover;

import java.util.List;

import ent.individual.Individual;

/**
 * An actual implementation of the one-point crossover reproduction strategy for the reproduction phase.
 * (Abstract Factory implementation).
 */
public class OnePoint implements Crossover {

    // Abstract Factory's Factory method is a thread-safe Singleton class
    // via Double-checked locking
    private volatile static OnePoint instance;

    // private constructor to avoid other classes to use constructor
    private OnePoint() {
    }

    /**
     * @return OnePoint
     */
    public static OnePoint getInstance() {
        if (instance == null) {
            // The synchronized block of code now runs only once
            // when the singleton has not been created yet
            synchronized (OnePoint.class) {
                if (instance == null) {
                    // Providing the singleton with a double checked locking initialization
                    instance = new OnePoint();
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
        System.out.println("Performing one point crossover...");
        return individuals;
    }

}