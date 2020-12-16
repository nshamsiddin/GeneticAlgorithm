package strategies.select;

import java.util.List;

import ent.individual.Individual;

public interface Selection {

	List<Individual> doSelection(List<Individual> individuals);

}
