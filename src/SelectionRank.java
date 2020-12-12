import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SelectionRank implements Selection {

    List<Individual> ranked;
    final double PRESSURE = 0.3; // the percentage of individuals to be selected

    SelectionRank() {
        ranked = new ArrayList<Individual>();
    }

    @Override
    public Individual selectParent(Population aPopulation) {
        return new Individual(0);
    }

    @Override
    public List<Individual> performSelection(Population aPopulation) {
        ranked.addAll(aPopulation.population);

        // Reorder the individuals by their fitness value
        ranked.sort(new Comparator<Individual>() {
            @Override
            public int compare(Individual i1, Individual i2) {
                return (int) (i1.getFitness() - i2.getFitness()); // in ascending order
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