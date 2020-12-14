import entities.Population;

public class Runner {
	public static void main(String[] args) {
		Population p = Population.getInstance();
		System.out.println(p.toString());
	}
}