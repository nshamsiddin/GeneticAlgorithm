import java.util.Random;

/**
 * This class models a gene.
 * @author Julian, Yusuf, Hassan, Shamsiddin, Angeeth
 * @version 1.0 (07/12/2020)
 */
class Gene {

    // This is just one "model", using letters is just one way
    // to "represent" genes.
    static final char[] LETTERS = {'a', 't', 'g', 'c'};
    char[] code;
    Random rand = new Random();

    Gene() {
        code = new char[4];
        for (int i = 0; i < code.length; i++) {
            // generates a random int between 0 and 3,
            // which are the possible index values
            code[i] = LETTERS[rand.nextInt(LETTERS.length)];
        }
    }

    @Override
    public String toString() {
        return String.valueOf(code) + ", "; // improve readability
    }

    // for testing purposes
    public static void main(String[] args) {
        Gene x;
        for (int i = 0; i < 4; i++) {
            x = new Gene();
            System.out.println(x);
        }
    }
}