import ent.population.Population;
import producers.PopulationGenerator;
import producers.PopulationGeneratorX;

public class TestDrive {

    public static void main(String[] args) {
        PopulationGenerator generatorX = new PopulationGeneratorX();
        Population p = generatorX.generatePopulation("X");
        System.out.println(p.toString());
    }
}
