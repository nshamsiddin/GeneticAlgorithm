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
}
