package producers;

import ent.Population;
import ent.PopulationX;
import factories.mutation.BitInversion;
import factories.mutation.Mutation;
import factories.selection.Elitism;
import factories.selection.Selection;

public class PopulationGeneratorX extends PopulationGenerator {
    @Override
    protected Population createPopulation(String type) {

        Population population = null;
        Mutation mutation = null;
        Selection selection = null;

        if (type.equals("X")) {
            mutation = new BitInversion();
            selection = new Elitism();
        }
        population = new PopulationX(mutation, selection);
        
        // population.doCrossover();
        
        return population;
    }

}
