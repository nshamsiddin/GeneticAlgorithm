/**
 * This class represents an Individual.
 * It "contains" Chromosomes. It uses an array to
 * model the fact that it contains "many" chromosomes.
 * For simplicity, the model only contains two chromosomes
 * per individual, therefore modelling a jack jumper ant
 * individual of the specie Myrmecia pilosula.
 */
class Individual {

    Chromosome[] chromosomes = new Chromosome[2]; // hard-coded for demonstration
    double fitness;
    int individualNumber;

    Individual (int anIndividualNumber) {
        this.individualNumber = anIndividualNumber;
        for (int i = 0; i < chromosomes.length; i++) {
            chromosomes[i] = new Chromosome();
        }
    }

    void setFitness(double aFitness) {
        fitness = aFitness;
    }

    double getFitness() {
        return fitness;
    }

    @Override
    public String toString() {
        StringBuilder individualAsString = new StringBuilder();
        individualAsString.append("Individual " + individualNumber + " ");
        //individualAsString.append("Individual " + String.format("%02d", individualNumber) + " ");
        for (Chromosome c : chromosomes) {
            individualAsString.append(c.toString());
        }
        String fitString = String.format("%.2f", fitness);
        individualAsString.append("\t" + fitString);
        return individualAsString.toString();
    }
}