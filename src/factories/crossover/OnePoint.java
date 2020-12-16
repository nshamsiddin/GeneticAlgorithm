package factories.crossover;

import java.util.List;

import ent.Individual;

// Abstract Factory's Factory method is a thread-safe Singleton class

public class OnePoint implements Crossover {

    private static final OnePoint instance = new OnePoint();

    // private constructor to avoid other classes to use constructor
    private OnePoint() {
    }

    public static OnePoint getInstance() {
        return instance;
    }

    @Override
    public List<Individual> doCrossover(List<Individual> individuals) {
        System.out.println("Performing one point crossover...");
        return individuals;
    }

}
