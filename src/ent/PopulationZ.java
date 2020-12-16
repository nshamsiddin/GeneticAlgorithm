package ent;

import java.util.ArrayList;

import factories.crossover.Crossover;

public class PopulationZ extends Population {

    // GenerationMethod generationMethod;
    Crossover crossover;

    public PopulationZ(Crossover crossover) {
        this.crossover = crossover;
    }

    /**
     * @param size
     */
    @Override
    public void populate(Integer size) {
        System.out.println("Populating with Z individuals...");
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            individuals.add(new IndividualZ());
        }
    }

    @Override
    public void crossover() {
        individuals = crossover.doCrossover(individuals);
    }

}
