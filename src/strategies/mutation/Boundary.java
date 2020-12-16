package strategies.mutation;

import java.util.List;

import ent.individual.Individual;

public class Boundary implements Mutation {

    /**
     * @param individuals
     * @return List<Individual>
     */

    @Override
    public List<Individual> doMutation(List<Individual> individuals) {
        System.out.println("Mutation by boundary...");
        return individuals;
    }

}
