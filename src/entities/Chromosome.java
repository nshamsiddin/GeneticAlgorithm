package src.entities;

import java.util.LinkedList;
import java.util.List;

public class Chromosome {
	private List<Gene> genes;
	private static final int geneLength = 2;

	public Chromosome() {
		setGenes(new LinkedList<>());
		for (int i = 0; i < geneLength; i++) {
			genes.add(new Gene());
		}
	}
        
        //My constructor
        public Chromosome(List<Gene> list){
            this.genes = list;
        }

	public List<Gene> getGenes() {
		return genes;
	}

	public void setGenes(List<Gene> genes) {
		this.genes = genes;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		// String delimiter = "==========\n";
		result.append("[");
		for (Gene g : genes) {
			result.append(g.toString());
		}
		result.append("]");
		return result.toString();
	}

	public static void main(String[] args) {

	}

}
