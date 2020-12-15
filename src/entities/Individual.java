package src.entities;

import java.util.LinkedList;
import java.util.List;

public class Individual {
    public Integer chromosomesNumber = 1;
    List<Chromosome> chromosomes;

    public Individual() {
        chromosomes = new LinkedList<>();
        for (int i = 0; i < chromosomesNumber; i++) {
            chromosomes.add(new Chromosome());
        }
    }
    
    //My code
    public Individual(List<Chromosome> list){
        this.chromosomes = list;
    }
    

    public List<Chromosome> getChromosomes() {
        return chromosomes;
    }

    public void setChromosomes(List<Chromosome> chromosomes) {
        this.chromosomes = chromosomes;
    }

    
    
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Chromosome c : chromosomes) {
            result.append(c.toString());
            result.append("\n");
            //System.out.println("chromosome : "+ c.toString());
        }
        return result.toString();
    }

}
