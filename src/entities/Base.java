package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Base {
	// ADENINE, GUANINE, CYTOSINE, THYMINE;
	A, G, C, T;

	public static Base getPair(Base b) {
		Base result = null;
		switch (b) {
			case A:
				result = T;
				break;
			case T:
				result = A;
				break;
			case G:
				result = C;
				break;
			case C:
				result = G;
				break;
		}
		return result;
	}

	private static final List<Base> list = new ArrayList<>(Arrays.asList(Base.A, Base.T, Base.G, Base.C));

	public static Base getRandom() {
		return list.get((int) Math.random() * (list.size() - 1) + 1);
	}
}
