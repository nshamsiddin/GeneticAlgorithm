package ent;

import java.util.ArrayList;

import factories.crossover.Crossover;
import factories.mutation.BitInversion;
import factories.selection.Selection;

public class PopulationX extends Population {

    // GenerationMethod generationMethod;
    Crossover crossover;
    Selection selection;

    public PopulationX(Crossover crossover, Selection selection) {
        this.crossover = crossover;
        this.selection = selection;
        this.mutation = new BitInversion();
    }

    @Override
    public void populate(Integer size) {
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            individuals.add(new IndividualX());
        }
    }

    @Override
    public void crossover() {
        individuals = crossover.doCrossover(individuals);
    }

    // @Override
    // public void mutate() {
    //     individuals = mutation.doMutation(individuals);

    // }

    @Override
    public void select() {
        individuals = selection.doSelection(individuals);
    }


}
