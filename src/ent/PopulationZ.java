package ent;

import factories.crossover.Crossover;

// import factories.GenerationMethod;

public class PopulationZ extends Population {

    // GenerationMethod generationMethod;
    Crossover crossover;

    public PopulationZ(Crossover crossover) {
        this.crossover = crossover;
    }

    @Override
    public void populate(Integer size) {
        // TODO Auto-generated method stub
    }

    @Override
    public void crossover() {
    individuals = crossover.doCrossover(individuals);
    }


}
