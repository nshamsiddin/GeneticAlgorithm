package entities;

import java.util.ArrayList;
import java.util.List;

public class Gene {
	private List<BasePair> code;
	private static final int codeLength = 4;

	public Gene() {
		setCode(new ArrayList<>());

		for (int i = 0; i < codeLength; i++) {
			// randomly generated base pairs
			code.add(new BasePair());
		}
	}

	public List<BasePair> getCode() {
		return code;
	}

	public void setCode(List<BasePair> code) {
		this.code = code;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		String delimiter = "----------\n";
		result.append(delimiter);
		for (BasePair b : code) {
			result.append(b.toString());
		}
		return result.toString();
	}

}
