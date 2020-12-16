package producers;

import ent.Population;
import ent.PopulationX;
import factories.crossover.Crossover;
import factories.crossover.OnePoint;


public class PopulationGeneratorX extends PopulationGenerator {
    @Override
    protected Population createPopulation(String type) {

        Population population = null;

        Crossover crossover = null;

        if (type.equals("X")) {
            crossover = OnePoint.getInstance();
        }
        population = new PopulationX(crossover);

        return population;
    }

}
