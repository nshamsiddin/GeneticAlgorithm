package producers;

import ent.Population;
import ent.PopulationX;
import factory.GenerationMethod;
import factory.GenerationMethodX;

public class PopulationGeneratorX extends PopulationGenerator {
    @Override
    protected Population createPopulation(String type) {
        Population population = null;
        GenerationMethod generationMethod = new GenerationMethodX();
        if (type.equals("X")) {
            population = new PopulationX(generationMethod);
        }
        return population;
    }

}
