package ent;

import java.util.List;

import strategies.mutation.Mutation;
import strategies.select.Selection;

public abstract class Population {

    Mutation mutation;
    Selection selection;

    private Integer generation;

    protected List<Individual> individuals;

    public abstract void crossover();

    public abstract void populate(Integer size);

    public void doMutatation() {
        mutation.doMutation(individuals);
    }

    public void doSelect() {
        selection.doSelection(individuals);
    }

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

    public Integer getGeneration() {
        return generation;
    }

    public List<Individual> getIndividuals() {
        return individuals;
    }

    public void setIndividuals(List<Individual> individuals) {
        this.individuals = individuals;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

}