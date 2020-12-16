package ent;

import factory.GenerationMethod;

public class PopulationZ extends Population {

    GenerationMethod generationMethod;

    public PopulationZ(GenerationMethod generationMethod) {
        this.generationMethod = generationMethod;
    }

    @Override
    public void populate(Integer size) {
        // TODO Auto-generated method stub

    }

    @Override
    public void crossover() {
        individuals = generationMethod.doCrossover(individuals);
    }

    @Override
    public void mutate() {
        individuals = generationMethod.doMutation(individuals);

    }

    @Override
    public void select() {
        individuals = generationMethod.doSelection(individuals);
    }

}
