package ent;

import java.util.List;

public abstract class Population {

    private Integer generation;

    protected List<Individual> individuals;

    public abstract void crossover();

    public abstract void mutate();

    public abstract void select();

    public abstract void populate(Integer size);

   
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