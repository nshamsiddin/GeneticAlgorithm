class SelectionIrish implements Selection {

    @Override
    public Individual selectParent(Population aPopulation) {
        System.out.println("here ya go horse, have fun");
        return new Individual();
    }
}