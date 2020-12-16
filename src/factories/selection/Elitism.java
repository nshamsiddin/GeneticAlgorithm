package factories.selection;

import java.util.List;

import ent.Individual;

public class Elitism implements Selection {

    @Override
    public List<Individual> doSelection(List<Individual> individuals) {
        // TODO Auto-generated method stub
        System.out.println("Selection based on eliteness");
        return individuals;
    }
    
}
