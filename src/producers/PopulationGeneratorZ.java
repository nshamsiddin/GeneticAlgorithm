package producers;

import ent.population.Population;
import ent.population.PopulationZ;
import factories.crossover.Crossover;
import factories.crossover.Uniform;

public class PopulationGeneratorZ extends PopulationGenerator {

    /**
     * @param type
     * @return Population
     */
    @Override
    protected Population createPopulation(String type) {
        Population population = null;

        Crossover crossover = null;

        if (type.equals("Z1")) {
            crossover = Uniform.getInstance();
        }
        population = new PopulationZ(crossover);

        return population;
    }

}
