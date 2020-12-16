package strategies.select;

import java.util.List;

import ent.individual.Individual;

public class Rank implements Selection {

    @Override
    public List<Individual> doSelection(List<Individual> individuals) {
        System.out.println("Selection based on rank");
        return null;
    }

}
