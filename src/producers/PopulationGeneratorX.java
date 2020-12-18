package producers;

import ent.population.Population;
import ent.population.PopulationX;
import factories.crossover.Crossover;
import factories.crossover.OnePoint;

/**
 * This class represents a particular implementation of the factory interface.
 * PopulationX is being created in this factory implementation.
 */
public class PopulationGeneratorX extends PopulationGenerator {

    /**
     * @param type
     * @return Population
     */
    @Override
    protected Population createPopulation(String type) {

        Population population = null;

        Crossover crossover = null;

        if (type.equals("X1")) {
            crossover = OnePoint.getInstance();
        }
        population = new PopulationX(crossover);

        return population;
    }

}