package ent.individual;

import java.util.ArrayList;

/**
 * Specific implementation of an individual containing an ArrayList of characters using
 * (0,1) as the encoding for the genes.
 */
public class IndividualX extends Individual {

    public IndividualX() {
        // genes are decoded as bits
        genes = new ArrayList<Character>();
        for (int i = 0; i < 10; i++) {
            if (Math.random() > 0.5) {
                genes.add('0');
            } else {
                genes.add('1');
            }
        }
    }
}