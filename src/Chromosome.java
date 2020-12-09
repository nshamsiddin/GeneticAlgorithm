/**
 * This class models (roughly) a Chromosome.
 * It "contains" Genes. It uses an array to
 * model the fact that it contains "many" genes.
 */
class Chromosome {

    Gene[] genes = new Gene[10]; // hard-coded for demonstration
    double fitness;

    Chromosome() {
        for (int i = 0; i < genes.length; i++) {
            genes[i] = new Gene();
        }
    }

    double getFitness() {
        return fitness;
    }

    void setFitness(double aFitness) {
        fitness = aFitness;
    }

    @Override
    public String toString() {
        StringBuilder chromosomeAsString = new StringBuilder();
        for (Gene g : genes) {
            chromosomeAsString.append(g.toString());
        }
        String fitString = String.format("%.2f", fitness);
        chromosomeAsString.append("\t" + fitString);
        return chromosomeAsString.toString();
    }

    // for testing purposes
    public static void main(String[] args) {
        Chromosome x = new Chromosome();
        x.setFitness(0.45);
        System.out.println(x);
    }
}