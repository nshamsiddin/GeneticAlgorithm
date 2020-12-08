class SelectionFrench implements Selection {

    @Override
    public Individual selectParent(Population aPopulation) {
        System.out.println("...ere, iz, uyor parent moinseur!");
        return new Individual();
    }
}