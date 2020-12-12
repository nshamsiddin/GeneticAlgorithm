import java.util.ArrayList;
import java.util.List;

class SelectionIrish implements Selection {

    @Override
    public Individual selectParent(Population aPopulation) {
        System.out.println("here ya go horse, have fun");
        return new Individual(0);
    }

    @Override
    public List<Individual> performSelection(Population aPopulation) {
        return new ArrayList<Individual>();
    }
}