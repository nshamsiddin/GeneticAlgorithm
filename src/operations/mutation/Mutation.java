package operations.mutation;


import entities.Population;


public interface Mutation {
    public Population mutate(Population p);
}
