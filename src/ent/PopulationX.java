package ent;

import java.util.ArrayList;

import factories.crossover.Crossover;
import strategies.mutation.BitInversion;
import strategies.select.Elitism;

public class PopulationX extends Population {

    // GenerationMethod generationMethod;
    Crossover crossover;

    public PopulationX(Crossover crossover) {
        setGeneration(0);
        this.crossover = crossover;
        this.mutation = new BitInversion();
        this.selection = new Elitism();
    }

    @Override
    public void populate(Integer size) {
        System.out.println("Populating...");
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            individuals.add(new IndividualX());
        }
    }

    @Override
    public void crossover() {
        individuals = crossover.doCrossover(individuals);
    }


}
