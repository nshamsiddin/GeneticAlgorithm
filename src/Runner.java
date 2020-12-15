package src;

import src.entities.Base;
import src.entities.Individual;
import src.entities.Population;

public class Runner {
    
    static Algorithm algo = new Algorithm(new Population(10));
    static Individual div1, div2, offspring;
    static Base first_base, second_base;
    
    public static void main(String[] args) {
        String match = "AA";
        String result = run();
        while(!result.equals(match)){
            result = run();
        }
        
        System.out.println("We have found a match\n");
        System.out.println("Generation: " + algo.getGenerationCount());
        System.out.println("Genes: " + offspring.getChromosomes().get(0).getGenes().toString());
            
    }
    
    public static String run(){
        div1 = algo.selection();
        div2 = algo.selection();
        offspring = algo.crossover(div1,div2);
        first_base = offspring.getChromosomes().get(0).getGenes().get(0).getCode().get(0);
        second_base = offspring.getChromosomes().get(0).getGenes().get(0).getCode().get(1);
        String combo = first_base.toString() + second_base.toString();
        return combo;
    }
   
}
