/**
 * This class models (roughly) a Chromosome.
 * It "contains" Genes. It uses an array to
 * model the fact that it contains "many" genes.
 */
class Chromosome {

    Gene[] genes = new Gene[10]; // hard-coded for demonstration

    Chromosome() {
        for (int i = 0; i < genes.length; i++) {
            genes[i] = new Gene();
        }
    }

    @Override
    public String toString() {
        StringBuilder chromosomeAsString = new StringBuilder();
        for (Gene g : genes) {
            chromosomeAsString.append(g.toString());
        }
        return chromosomeAsString.toString();
    }

    // for testing purposes
    public static void main(String[] args) {
        Chromosome x = new Chromosome();
        System.out.println(x);
    }
}