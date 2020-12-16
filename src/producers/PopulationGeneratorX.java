package producers;

import ent.population.Population;
import ent.population.PopulationX;
import factories.crossover.Crossover;
import factories.crossover.OnePoint;

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
