package ent.population;

import java.util.ArrayList;

import ent.individual.IndividualZ;
import factories.crossover.Crossover;
import strategies.mutation.Boundary;
import strategies.select.Rank;

/**
 * Concrete product of the Factory Pattern for mass production.
 * The method for creation of instances of concrete products is
 * defined in Factory methods - Crossover in this case;
 * The concrete Factory is passed by PopulationGeneration subclass
 * while initiating an instance.
 */
public class PopulationZ extends Population {

    // Abstract Factory Interface
    Crossover crossover;

    public PopulationZ(Crossover crossover) {
        setGeneration(0);
        this.crossover = crossover;

        // Specific strategies used for the current concrete product
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