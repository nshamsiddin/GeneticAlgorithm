package ent;

import java.util.ArrayList;

import factory.GenerationMethod;

public class PopulationX extends Population {

    GenerationMethod generationMethod;

    public PopulationX(GenerationMethod generationMethod) {
        this.generationMethod = generationMethod;
    }

    @Override
    public void populate(Integer size) {
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            individuals.add(new IndividualX());
        }
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
