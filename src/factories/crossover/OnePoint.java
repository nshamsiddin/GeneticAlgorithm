package factories.crossover;

import java.util.List;

import ent.individual.Individual;

// Abstract Factory implementation

public class OnePoint implements Crossover {

    // Abstract Factory's Factory method is a thread-safe Singleton class
    private static final OnePoint instance = new OnePoint();

    // private constructor to avoid other classes to use constructor
    private OnePoint() {
    }

    /**
     * @return OnePoint
     */
    public static OnePoint getInstance() {
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
