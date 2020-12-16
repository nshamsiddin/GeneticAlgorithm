package factories.crossover;

import java.util.List;

import ent.individual.Individual;

public class TwoPoint implements Crossover {

    @Override
    public List<Individual> doCrossover(List<Individual> individuals) {
        return individuals;
    }

}
