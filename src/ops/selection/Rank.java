package ops.selection;

import ent.Individual;
import ent.IndividualX;
import ent.Population;

public class Rank implements Selection {

    @Override
    public Individual selectParent(Population aPopulation) {
        System.out.println("Perform selection via Rank method");
        return new IndividualX();
    }
}
