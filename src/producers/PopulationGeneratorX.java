package producers;

import ent.Population;
import ent.PopulationX;
import factories.crossover.Crossover;
import factories.crossover.OnePoint;
import factories.selection.Elitism;
import factories.selection.Selection;

public class PopulationGeneratorX extends PopulationGenerator {
    @Override
    protected Population createPopulation(String type) {

        Population population = null;
        Crossover crossover = null;
        Selection selection = null;

        if (type.equals("X")) {
            crossover = new OnePoint();
            selection = new Elitism();
        }
        population = new PopulationX(crossover, selection);
        
        population.doMutation();
        
        return population;
    }

}
