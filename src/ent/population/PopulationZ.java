package ent.population;

import java.util.ArrayList;

import ent.individual.IndividualZ;
import factories.crossover.Crossover;
import strategies.mutation.Boundary;
import strategies.select.Rank;

public class PopulationZ extends Population {

    // GenerationMethod generationMethod;
    Crossover crossover;

    public PopulationZ(Crossover crossover) {
        setGeneration(0);
        this.crossover = crossover;
        /**
         * Strategies specific for current concrete product
         */
        this.mutation = new Boundary();
        this.selection = new Rank();
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
