package entities;

import java.util.ArrayList;
import java.util.List;

public class Gene {
	private List<Base> code;
	private static final int codeLength = 4;

	public Gene() {
		setCode(new ArrayList<>());

		for (int i = 0; i < codeLength; i++) {
			// randomly generated bases
			code.add(Base.getRandom());
		}
	}

	public List<Base> getCode() {
		return code;
	}

	public void setCode(List<Base> code) {
		this.code = code;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("{");
		for (Base b : code) {
			result.append(b.name());
		}
		result.append("}");
		return result.toString();
	}

}
