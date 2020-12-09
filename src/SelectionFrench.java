import java.util.ArrayList;
import java.util.List;

class SelectionFrench implements Selection {

    @Override
    public Individual selectParent(Population aPopulation) {
        System.out.println("...ere, iz, uyor parent moinseur!");
        return new Individual();
    }

    @Override
    public List<Chromosome> performSelection(Population aPopulation) {
        return new ArrayList<Chromosome>();
    }
}