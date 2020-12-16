package producers;

import ent.Population;
import ent.PopulationX;
import ent.PopulationZ;
import factory.GenerationMethod;
import factory.GenerationMethodX;

public class PopulationGeneratorX extends PopulationGenerator {
    @Override
    protected Population createPopulation(String type) { // parameterized method
        Population population = null;
        // we assume that the generation method is "GenerationMethodX", can be encapsulated
        GenerationMethod generationMethod = new GenerationMethodX();
        if (type.equals("X")) { // this is factory method ?
            population = new PopulationX(generationMethod); // create a concrete type of population, i.e. PopulationX
        } else if (type.equals("Z")) {
            population = new PopulationZ(new GenerationMethodX()); // but only associated with X
        } else return null;
        return population;
    }

}
