package strategies.select;

import java.util.List;

import ent.individual.Individual;

public class Elitism implements Selection {

    
    /** 
     * @param individuals
     * @return List<Individual>
     */
    @Override
    public List<Individual> doSelection(List<Individual> individuals) {
        System.out.println("Selection based on eliteness");
        return individuals;
    }
    
}
