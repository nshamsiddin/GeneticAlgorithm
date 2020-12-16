package producers;

import ent.population.Population;

public abstract class PopulationGenerator {

    
    /** 
     * @param type
     * @return Population
     */
    public Population generatePopulation(String type) {

        Population population = createPopulation(type);
        population.populate(100);

        population.crossover();

        population.doMutatation();

        population.doSelect();

        return population;

    }

    protected abstract Population createPopulation(String type);

}
