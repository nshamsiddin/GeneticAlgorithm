package ent.population;

import java.util.List;

import ent.individual.Individual;
import strategies.mutation.Mutation;
import strategies.select.Selection;

/**
 *  Abstract product class that is required in the Factory Pattern
 */
public abstract class Population {

    Mutation mutation;
    Selection selection;

    private Integer generation;

    protected List<Individual> individuals;


    public abstract void crossover();

    /**
     * @param size
     */
    public abstract void populate(Integer size);

    public void doMutation() {
        mutation.doMutation(individuals);
    }

    public void doSelect() {
        selection.doSelection(individuals);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Generation: " + generation + "\n");
        for (Individual ind : individuals) {
            str.append(ind.toString() + "\n");
        }
        str.append("\n");
        return str.toString();
    }

    /**
     * @return Integer
     */
    public Integer getGeneration() {
        return generation;
    }

    /**
     * @param generation
     */
    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    /**
     * @return List<Individual>
     */
    public List<Individual> getIndividuals() {
        return individuals;
    }

    /**
     * @param individuals
     */
    public void setIndividuals(List<Individual> individuals) {
        this.individuals = individuals;
    }

}