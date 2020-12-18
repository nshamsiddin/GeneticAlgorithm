package factories.crossover;

import java.util.List;

import ent.individual.Individual;

/**
 * An actual implementation of the two-point crossover reproduction strategy for the reproduction phase.
 */
public class TwoPoint implements Crossover {

    @Override
    public List<Individual> doCrossover(List<Individual> individuals) {
        return individuals;
    }

}