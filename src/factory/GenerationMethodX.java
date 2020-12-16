package factory;

import java.util.List;

import ent.Individual;

public class GenerationMethodX implements GenerationMethod {

    @Override
    public List<Individual> doCrossover(List<Individual> individuals) {
        System.out.println("Performing one point crossover...");
        return individuals;
    }

    @Override
    public List<Individual> doMutation(List<Individual> individuals) {
        System.out.println("Performing one point mutation...");
        return individuals;
    }

    @Override
    public List<Individual> doSelection(List<Individual> individuals) {
        System.out.println("Performing selection based on ranking...");
        return individuals;
    }

}