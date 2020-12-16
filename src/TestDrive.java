import ent.Population;
import ops.crossover.Crossover;
import ops.crossover.OnePoint;
import ops.selection.Elitism;
import ops.selection.Rank;
import ops.selection.Selection;
import producers.PopulationGenerator;
import producers.PopulationGeneratorX;

public class TestDrive {
    Selection selector;
    Crossover reproducer;

    private static TestDrive _instance = new TestDrive(); // Providing the singleton with an eager initialization

    // The private access modifier prevent the creation of
    // additional instances from this class.
    private TestDrive() {
        ; // Do nothing
    }

    public static TestDrive getInstance() {
        // Return the singleton static instance
        return _instance;
    }

    public static void main(String[] args) {
        TestDrive controller = TestDrive.getInstance();
        PopulationGenerator generatorX = new PopulationGeneratorX(); // instance to factory class
        Population p = generatorX.generatePopulation("X");
        controller.setSelection(new Elitism()); // strategy pattern applied to the selection algorithm
        controller.setReproduction(new OnePoint());
        controller.setSelection(new Rank()); // dynamically change the selection algorithm to be used
        System.out.println(p.toString());
    }

    void setSelection(Selection aSelectionStrategy) { // strategy pattern applied to the selection algorithm
        selector = aSelectionStrategy;
    }

    void setReproduction(Crossover aReproductionStrategy) {
        reproducer = aReproductionStrategy;
    }
}
