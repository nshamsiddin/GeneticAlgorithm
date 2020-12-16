import ent.population.Population;
import producers.*;

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
