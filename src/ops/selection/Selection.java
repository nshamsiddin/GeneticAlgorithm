package ops.selection;

import ent.Individual;
import ent.Population;

public interface Selection {

    Individual selectParent(Population aPopulation);
    
}
