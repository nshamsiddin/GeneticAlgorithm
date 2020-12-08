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

    static final char[] model = {'a', 't', 'g', 'c'}; // the model to be achieved

    GAController() {
        population = new Population();
        fitnessEvaluator = new FitnessEvaluator(model);
    }

    // start walk-through 02 implementation
    void start() {
        int generations = 2;
        double mutationRate = 0.1;
        for (int i = 0; i < generations; i++) {
            Individual parent1 = selector.selectParent(population);
            Individual parent2 = selector.selectParent(population);

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

    // start walk-through 01 implementation
    void run() {
        fitnessEvaluator.evaluate(population);
    }

    public static void main(String[] args) {
        // Walk-through 01
        GAController controller = new GAController();
        controller.run();
        System.out.println(controller.population);

        // Walk-through 02
        //GAController controller = new GAController();
        //controller.setSelection(new SelectionFrench());
        //controller.start();
        //controller.setSelection(new SelectionIrish());
        //controller.start();
    }
}