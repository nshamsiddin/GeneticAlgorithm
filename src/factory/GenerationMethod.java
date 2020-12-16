package factory;

import java.util.List;

import ent.Individual;

public interface GenerationMethod {

    public List<Individual> doCrossover(List<Individual> individuals);

    public List<Individual> doMutation(List<Individual> individuals);

    public List<Individual> doSelection(List<Individual> individuals);

}
