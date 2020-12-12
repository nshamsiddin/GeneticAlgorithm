import java.util.List;

interface Selection {

    Individual selectParent(Population aPopulation);

    List<Individual> performSelection(Population aPopulation);
}