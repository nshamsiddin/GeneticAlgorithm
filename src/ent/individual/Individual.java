package ent.individual;

import java.util.List;

/**
 * Simplified implementation of individuals containing an ArrayList of characters with a particular
 * encoding. For simplicity we have removed Chromosome, Base, BasePairs classes.
 */
public abstract class Individual {
    protected List<Character> genes;

    /**
     * @return String
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (Character c : genes) {
            result.append(c);
        }
        result.append("]");
        return result.toString();
    }
}