import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SelectionRank implements Selection {

    List<Chromosome> ranked;
    final double PRESSURE = 0.3; // the percentage of individuals to be selected

    SelectionRank() {
        ranked = new ArrayList<Chromosome>();
    }

    @Override
    public Individual selectParent(Population aPopulation) {
        return new Individual();
    }

    @Override
    public List<Chromosome> performSelection(Population aPopulation) {
        ranked.addAll(aPopulation.population);

        // Reorder the individuals by their fitness value
        ranked.sort(new Comparator<Chromosome>() {
            @Override
            public int compare(Chromosome c1, Chromosome c2) {
                return (int) (c1.getFitness() - c2.getFitness()); // in ascending order
            }
        });

        // Calculate the population index for obtaining ~30% of the individuals
        final int PRESSURE_INDEX = (int) Math.round(ranked.size() - PRESSURE * ranked.size());

        // Select the # best ranked individuals according to the pressure percentage value
        ranked = ranked.subList(PRESSURE_INDEX, ranked.size());
        System.out.println(ranked.toString()); // for testing purposes

        return ranked;
    }
}