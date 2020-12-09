import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasePair {

	private Base b1, b2;

	// random generation
	public BasePair() {
		List<Base> list = new ArrayList<>();
		list.addAll(Arrays.asList(Base.A, Base.T, Base.G, Base.C));
		this.b1 = list.get((int) Math.random() * 3 + 1);
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

}
