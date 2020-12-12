import java.util.List;

/**
 * The context from which the strategy pattern is implemented.
 */
class GAController {
    // A GA (Genetic Algorithm) uses a Population,
    // some Selection strategy, some Reproduction strategy,
    // and some Replacement strategy.

    Selection selector; // composition for the strategy pattern
    Reproduction reproducer;

    Population population;
    FitnessEvaluator fitnessEvaluator;

    static final char[] MODEL = {'a', 't', 'g', 'c'}; // the model to be achieved

    GAController() {
        population = new Population();
        fitnessEvaluator = new FitnessEvaluator(MODEL);
    }

    // Merge walk-through implementation 1 & 2
    void start() {
        int generations = 2;
        double mutationRate = 0.1;
        // Print the model to be achieved
        System.out.println("Model: " + String.valueOf(MODEL));
        for (int i = 0; i < generations; i++) {
            // Perform fitness evaluation
            fitnessEvaluator.evaluate(population);
            // Perform parents selection
            List<Individual> parents = selector.performSelection(population);

            //Individual parent1 = selector.selectParent(population);
            //Individual parent2 = selector.selectParent(population);

            //Individual child1 = reproducer.crossover(parent1, parent2);
            //Individual child2 = reproducer.crossover(parent1, parent2);

            //mutator.mutate(child1, mutationRate);
            //mutator.mutate(child2, mutationRate);

            //replacer.tryReplace(child1, population);
            //replacer.tryReplace(child2, population);
        }
    }

    // Allow any implementer of the Selection or Reproduction
    // interfaces to be passed in, and then set the selector
    // or reproducer to refer to an object of the type passed in.
    void setSelection(Selection aSelectionStrategy) {
        // The type defined is an interface but through polymorphism
        // any concrete implementing class will be accepted.
        selector = aSelectionStrategy;
    }

    void setReproduction(Reproduction aReproductionStrategy) {
        reproducer = aReproductionStrategy;
    }

    public static void main(String[] args) {
        // Merge walk-through implementation 1 & 2
        GAController controller = new GAController();
        controller.setSelection(new SelectionRank());
        controller.start();
        System.out.println(controller.population);
    }
}