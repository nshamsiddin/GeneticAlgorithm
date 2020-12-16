package ent.individual;

import java.util.ArrayList;

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