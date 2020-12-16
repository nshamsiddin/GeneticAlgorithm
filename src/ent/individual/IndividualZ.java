package ent.individual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndividualZ extends Individual {

    private static final List<Character> bases = new ArrayList<>(Arrays.asList('a', 't', 'g', 'c'));

    public IndividualZ() {
        // genes are decoded as a, t, g, c
        genes = new ArrayList<Character>();
        for (int i = 0; i < 10; i++) {
            genes.add(bases.get((int) (Math.random() * bases.size() - 1)));
        }
    }
}
