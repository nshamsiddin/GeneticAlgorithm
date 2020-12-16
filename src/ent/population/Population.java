package ent.population;

import java.util.List;

import ent.individual.Individual;
import strategies.mutation.Mutation;
import strategies.select.Selection;

/**
 *  Abstract product class that required in the Factory Pattern
 */
public abstract class Population {

    Mutation mutation;
    Selection selection;

    private Integer generation;

    protected List<Individual> individuals;

    
    /** 
     * @param doMutatation(
     */
    /**
     * @param doMutatation(
     */
    public abstract void crossover();

    /**
     * @param doMutatation(
     */
    public abstract void populate(Integer size);

    public void doMutatation() {
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
        StringBuffer str = new StringBuffer();
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

    /**
     * @param generation
     */
    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

}