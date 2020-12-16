package ent.individual;

import java.util.List;

/**
 * Simplified implementation of individuals containing ArrayList of characters
 * (0,1) as genes. We have eliminated Chromosome, Base, BasePairs for simplicity
 */

public abstract class Individual {
    protected List<Character> genes;

    /**
     * @return String
     */
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("[");
        for (Character c : genes) {
            result.append(c);
        }
        result.append("]");
        return result.toString();
    }
}
