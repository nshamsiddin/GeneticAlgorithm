package factory;

import java.util.List;

import ent.Individual;

public interface GenerationMethod { // not the interface required for an abstract factory,
                                    // otherwise will provide composition

    public List<Individual> doCrossover(List<Individual> individuals);

    public List<Individual> doMutation(List<Individual> individuals);

    public List<Individual> doSelection(List<Individual> individuals);

}
