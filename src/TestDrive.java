import ent.population.Population;
import producers.*;

/**
 * The following code aims to implement a simulation of a Genetic Algorithm in Java.
 * The class TestDrive is the context from which the genetic algorithm is implemented.
 * @version 1.0 (18/12/2020)
 * @see "README.txt" file for full implementation description
 */
public class TestDrive {

    public static void main(String[] args) {
        PopulationGenerator generatorX = new PopulationGeneratorX();
        Population pX = generatorX.generatePopulation("X1");
        System.out.println(pX.toString());

        PopulationGenerator generatorZ = new PopulationGeneratorZ();
        Population pZ = generatorZ.generatePopulation("Z1");
        System.out.println(pZ.toString());
    }
}