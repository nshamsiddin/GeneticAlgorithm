import java.util.LinkedList;
import java.util.List;

public class Chromosome {
	private List<DNA> dna;

	public Chromosome() {
		setDna(new LinkedList<>());
	}

	public List<DNA> getDna() {
		return dna;
	}

	public void setDna(List<DNA> dna) {
		this.dna = dna;
	}

}
