package producers;

import ent.population.Population;

/**
 * This class represents the factory interface for product creation.
 */
public abstract class PopulationGenerator {

    /**
     * @param type
     * @return Population
     */
    public Population generatePopulation(String type) {

        Population population = createPopulation(type); // delegation
        population.populate(100);

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.println("Generation: " + i);
            System.out.println("------------------------------");
            
            population.setGeneration(i);

            population.doSelect();

            population.crossover();
            
            population.doMutation();
            
            System.out.println("------------------------------");
        }

        return population;

    }

    // the factory method of the creator class
    protected abstract Population createPopulation(String type);

}