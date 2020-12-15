package operations.crossover;

import entities.Population;

public class SinglePoint implements Crossover {

    @Override
    public Population doCrossover(Population p) {
        // TODO Auto-generated method stub
        System.out.println("Doing single point crossover...");
        return p;
    }

}
