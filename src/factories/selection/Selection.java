package factories.selection;

import java.util.List;

import ent.Individual;

public interface Selection {

	List<Individual> doSelection(List<Individual> individuals);

}
