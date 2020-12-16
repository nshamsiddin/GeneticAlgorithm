package ent;

import java.util.List;

public abstract class Individual {
    protected List<Character> genes;

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
