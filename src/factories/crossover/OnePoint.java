package factories.crossover;

import java.util.List;

import ent.Individual;

public class OnePoint implements Crossover {

    @Override
    public List<Individual> doCrossover(List<Individual> individuals) {
        System.out.println("Performing one point crossover...");
        return individuals;
    }

}
