package producers;

import ent.Population;
import ent.PopulationX;
import factories.crossover.Crossover;
import factories.mutation.Mutation;
import factories.selection.Selection;
import factory.GenerationMethod;
import factory.GenerationMethodX;

public class PopulationGeneratorX extends PopulationGenerator {
    @Override
    protected Population createPopulation(String type) {
        Population population = null;
        // GenerationMethod generationMethod = new GenerationMethodX();
        Crossover crossover;
        Mutation mutation;
        Selection selection;
        
        if (type.equals("X")) {
            population = new PopulationX();
        }
        return population;
    }

}
