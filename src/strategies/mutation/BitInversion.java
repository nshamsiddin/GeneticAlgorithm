package strategies.mutation;

import java.util.List;

import ent.individual.Individual;

/**
 * An actual implementation of the mutation by bit inversion strategy for the mutation phase.
 */
public class BitInversion implements Mutation {
    
    /** 
     * @param individuals
     * @return List<Individual>
     */
    @Override
    public List<Individual> doMutation(List<Individual> individuals) {
        System.out.println("Mutation by bit inversion...");
        return individuals;
    }

}