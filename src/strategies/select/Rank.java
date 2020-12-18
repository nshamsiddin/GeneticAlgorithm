package strategies.select;

import java.util.List;

import ent.individual.Individual;

/**
 * An actual implementation of the selection rank strategy for the selection phase.
 */
public class Rank implements Selection {

    /**
     * @param individuals
     * @return List<Individual>
     */
    @Override
    public List<Individual> doSelection(List<Individual> individuals) {
        System.out.println("Selection based on rank");
        return null;
    }

}