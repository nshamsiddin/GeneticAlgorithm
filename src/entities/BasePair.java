package entities;
// !!!!
// Not used for the current implementation
//
public class BasePair {

	private Base b1, b2;

	// random generation
	public BasePair() {
		setB1(Base.getRandom());
		setB2(Base.getPair(this.b1));
	}

	// one known generation
	public BasePair(Base b1) {
		setB1(b1);
		setB2(Base.getPair(b1));
	}

	// craete distinct base pair
	public BasePair(Base b1, Base b2) {
		setB1(b1);
		setB2(b2);
	}

	public String toString() {
		return "[" + b1 + " <==> " + b2 + "]\n";
	}

	public Base getB1() {
		return this.b1;
	}

	public Base getB2() {
		return this.b2;
	}

	public void setB1(Base b) {
		this.b1 = b;
		this.b2 = Base.getPair(b);
	}

	public void setB2(Base b) {
		this.b2 = b;
		this.b1 = Base.getPair(b);
	}

}
