package producers;

import ent.Population;

public abstract class PopulationGenerator {

    public Population generatePopulation(String type) {

        Population population = createPopulation(type);
        population.populate(100);

        population.doCrossover();

        population.mutate();

        population.select();

        return population;

    }

    protected abstract Population createPopulation(String type);

}
