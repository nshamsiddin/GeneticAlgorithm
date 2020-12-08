class FitnessEvaluator {

    void evaluate(Population p) {
        // for every chromosome in the population
        // evaluate the fitness of each chromosome
        for (Chromosome c : p.population) {
            evaluate(c);
        }
    }

    void evaluate(Chromosome c) {
        c.setFitness(Math.random()); // a random double between 0.0 and 1 (not incl. 1)
    }

    // for testing purposes
    public static void main(String[] args) {
        Population p = new Population();
        FitnessEvaluator f = new FitnessEvaluator();
        f.evaluate(p);
        System.out.println(p);
    }
}