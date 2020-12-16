package ent;

import factories.mutation.Mutation;
import factories.selection.Selection;
import strategies.crossover.Crossover;

// import factories.GenerationMethod;

public class PopulationZ extends Population {

    // GenerationMethod generationMethod;
    Mutation mutation;
    Selection selection;
    

    public PopulationZ(Crossover crossover, Selection selection) {
        this.crossover = crossover;
        this.selection = selection;
    }

    @Override
    public void populate(Integer size) {
        // TODO Auto-generated method stub
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
