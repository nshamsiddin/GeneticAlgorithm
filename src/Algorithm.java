package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import src.entities.Base;
import src.entities.Chromosome;
import src.entities.Gene;
import src.entities.Individual;
import src.entities.Population;

public class Algorithm {
    
    private int generationCount = 0;
    private Population population;
    
    public Algorithm(Population pop){
        this.population = pop;
    }
    
    public Individual crossover(Individual div1, Individual div2){
        Individual offspring = null;
        //Swap div1 first gene with div2 first gene and return offspring
        Gene from_div1 = div1.getChromosomes().get(0).getGenes().get(0);
        Gene from_div2 = div2.getChromosomes().get(0).getGenes().get(1);
        List<Gene> list = new ArrayList<>();
        //Offspring chromosomes
        list.add(from_div1);
        list.add(from_div2);
        Chromosome ch = new Chromosome(list);
        List<Chromosome> ch_list = new ArrayList<>();
        ch_list.add(ch);
        offspring = new Individual(ch_list);
        mutate(offspring);
        generationCount++;
        population.getIndividuals().set(new Random().nextInt(population.getIndividuals().size()), offspring);
        return offspring;
    }
    
    public void mutate(Individual div){
        Base[] arr = {Base.A, Base.C, Base.G, Base.T};
        for(int i=0; i<4; i++){
            // Change each genetic code to a new random one for first set of genes
            Base base = div.getChromosomes().get(0).getGenes().get(0).getCode().set(i, arr[new Random().nextInt(4)]);
        }
        for(int i=0; i<4; i++){
            // Change each genetic code to a new random one for second set of genes
            Base base = div.getChromosomes().get(0).getGenes().get(1).getCode().set(i, arr[new Random().nextInt(4)]);
        }
    }

    public Population getPopulation() {
        return population;
    }

    public void setPopulation(Population population) {
        this.population = population;
    }
    
    public Individual selection(){
        return population.getIndividuals().get(new Random().nextInt(population.getIndividuals().size()));
    }

    public int getGenerationCount() {
        return generationCount;
    }

    public void setGenerationCount(int generationCount) {
        this.generationCount = generationCount;
    }
    
    
}
