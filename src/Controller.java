import entities.Population;
import operations.crossover.Crossover;
import operations.crossover.SinglePoint;

public class Controller {
    private Crossover crossoverMethod;

    public Controller() {
        // System.out.println(p.toString());
        crossoverMethod = new SinglePoint();
        Population population = new Population(10);
        population.print();
        population = crossoverMethod.doCrossover(population);
        population.print();
    }
}
