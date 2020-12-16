package ent;

import java.util.ArrayList;

import factories.mutation.Mutation;
import factories.selection.Selection;
import strategies.crossover.OnePoint;

public class PopulationX extends Population {

    // GenerationMethod generationMethod;
    Mutation mutation;
    Selection selection;

    public PopulationX(Mutation mutation, Selection selection) {
        setGeneration(0);
        this.crossover = new OnePoint();
        this.mutation = mutation;
        this.selection = selection;
    }

    @Override
    public void populate(Integer size) {
        System.out.println("Populating...");
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            individuals.add(new IndividualX());
        }
    }

    // @Override
    // public void crossover() {
    //     individuals = crossover.doCrossover(individuals);
    // }

    @Override
    public void mutate() {
        individuals = mutation.doMutation(individuals);

    }

    @Override
    public void select() {
        individuals = selection.doSelection(individuals);
    }

}
