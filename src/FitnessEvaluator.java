class FitnessEvaluator {

    char[] model;

    FitnessEvaluator(char[] theModel) {
        model = theModel;
    }

    void evaluate(Population p) {
        // for every individual in the population
        // evaluate the fitness of each individual
        for (Individual i : p.population) {
            evaluate(i);
        }
    }

    void evaluate(Individual i) {
        // for every chromosome in the individual
        // evaluate the genetic code of each chromosome
        double fitness = 0.0;
        for (Chromosome c : i.chromosomes) {
            fitness += evaluate(c);
        }
        i.setFitness(fitness);
    }

    // compare each character in the genetic "code" with the model
    // to calculate the fitness of the individual
    double evaluate(Chromosome c) {
        double chromosomeFitness = 0.0;
        for (Gene g : c.genes) {
            for (int i = 0; i < g.code.length; i++) {
                if (g.code[i] == model[i]) {
                    chromosomeFitness += 1;
                }
            }
        }
        return chromosomeFitness;
    }

    // for testing purposes
    public static void main(String[] args) {
        Population p = new Population();
        FitnessEvaluator f = new FitnessEvaluator(new char[]{'a', 't', 'g', 'c'});
        f.evaluate(p);
        System.out.println(p);
    }
}