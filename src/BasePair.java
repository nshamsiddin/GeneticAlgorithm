import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasePair {

	private Base b1, b2;

	// random generation
	public BasePair() {
		this.b1 = Base.getRandom();
		this.b2 = Base.getPair(this.b1);
	}

	// one known generation
	public BasePair(Base b1) {
		this.b1 = b1;
		this.b2 = Base.getPair(b1);
	}

	public BasePair(Base b1, Base b2) {
		this.b1 = b1;
		this.b2 = b2;
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
