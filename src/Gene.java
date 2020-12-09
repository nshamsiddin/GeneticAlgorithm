import java.util.LinkedList;
import java.util.List;

public class Gene {
	private List<Chromosome> chromosomes;

	public Gene() {
		setChromosomes(new LinkedList<>());
	}

	public List<Chromosome> getChromosomes() {
		return chromosomes;
	}

	public void setChromosomes(List<Chromosome> chromosomes) {
		this.chromosomes = chromosomes;
	}
}
