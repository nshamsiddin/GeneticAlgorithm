package strategies.select;

import java.util.List;

import ent.individual.Individual;

/**
 * An actual implementation of the selection by elitism strategy for the selection phase.
 */
public class Elitism implements Selection {

    /** 
     * @param individuals
     * @return List<Individual>
     */
    @Override
    public List<Individual> doSelection(List<Individual> individuals) {
        System.out.println("Selection based on elitism");
        return individuals;
    }
    
}