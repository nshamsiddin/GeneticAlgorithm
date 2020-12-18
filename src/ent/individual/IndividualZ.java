package ent.individual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Specific implementation of an individual containing an ArrayList of characters using
 * (a,t,g,c) as the encoding for the genes.
 */
public class IndividualZ extends Individual {

    private static final List<Character> BASES = new ArrayList<>(Arrays.asList('a', 't', 'g', 'c'));

    public IndividualZ() {
        // genes are decoded as a, t, g, c
        genes = new ArrayList<Character>();
        for (int i = 0; i < 10; i++) {
            genes.add(BASES.get((int) (Math.random() * BASES.size() - 1)));
        }
    }
}