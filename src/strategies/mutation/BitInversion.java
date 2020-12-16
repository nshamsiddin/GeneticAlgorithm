package strategies.mutation;

import java.util.List;

import ent.Individual;

public class BitInversion implements Mutation {

    @Override
    public List<Individual> doMutation(List<Individual> individuals) {
        System.out.println("Mutation by bit inversion...");
        return individuals;
    }

}
