package ops.selection;

import ent.Individual;
import ent.IndividualX;
import ent.Population;

public class Elitism implements Selection {

    @Override
    public Individual selectParent(Population aPopulation) {
        System.out.println("Perform selection via Elitism method");
        return new IndividualX();
    }
    
}
