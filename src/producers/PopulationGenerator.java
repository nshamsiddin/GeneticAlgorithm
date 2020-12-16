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

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.println("Generation: " + i);
            System.out.println("------------------------------");
            
            population.setGeneration(i);
            
            population.crossover();
            
            population.doMutatation();
            
            population.doSelect();
            
            System.out.println("------------------------------");
        }

        return population;

    }

    protected abstract Population createPopulation(String type);

}
