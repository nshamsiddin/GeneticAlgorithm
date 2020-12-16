package producers;

import ent.Population;

// package "producers" is the factory for the GA algorithm
public abstract class PopulationGenerator {

    public Population generatePopulation(String type) {

        Population population = createPopulation(type); // delegation (to factory method)
        population.populate(100);

        population.crossover();
        population.mutate();
        population.select();
        return population;

    }

    protected abstract Population createPopulation(String type); // the factory method of the "creator" class

}
