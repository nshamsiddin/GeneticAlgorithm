import java.util.ArrayList;
import java.util.List;

class SelectionIrish implements Selection {

    @Override
    public Individual selectParent(Population aPopulation) {
        System.out.println("here ya go horse, have fun");
        return new Individual();
    }

    @Override
    public List<Chromosome> performSelection(Population aPopulation) {
        return new ArrayList<Chromosome>();
    }
}