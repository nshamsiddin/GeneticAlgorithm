import java.util.List;

interface Selection {

    Individual selectParent(Population aPopulation);

    List<Chromosome> performSelection(Population aPopulation);
}