class FitnessEvaluator {

    double fitness;
    char[] model;

    FitnessEvaluator(char[] theModel) {
        model = theModel;
    }

    void evaluate(Population p) {
        // for every chromosome in the population
        // evaluate the fitness of each chromosome
        for (Chromosome c : p.population) {
            evaluate(c);
        }
    }

    // compare each character in the genetic "code" with the model
    // to calculate the fitness of the individual
    void evaluate(Chromosome c) {
        fitness = 0.0;
        for (Gene g : c.genes) {
            for (int i = 0; i < g.code.length; i++) {
                if (g.code[i] == model[i]) {
                    fitness += 1;
                }
            }
        }
        c.setFitness(fitness);
    }

    // for testing purposes
    public static void main(String[] args) {
        Population p = new Population();
        FitnessEvaluator f = new FitnessEvaluator(new char[]{'a', 't', 'g', 'c'});
        f.evaluate(p);
        System.out.println(p);
    }
}