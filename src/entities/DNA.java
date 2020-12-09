package entities;

import java.util.LinkedList;
import java.util.List;

public class DNA {
	private List<BasePair> pairs;

	public DNA() {
		setPairs(new LinkedList<>());
	}

	public List<BasePair> getPairs() {
		return pairs;
	}

	public void setPairs(List<BasePair> pairs) {
		this.pairs = pairs;
	}

}
