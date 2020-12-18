This is the implementation of Genetic Algorithm

Instructions for compiling and running:

Run the Genetic Algorithm program from the "src" folder using the Terminal/CMD with the following command:

  javac TestDrive.java

  java TestDrive

You can test other values for the number of generations for the population by modifying the generatePopulation method of the PopulationGenerator.java file.

Explanation of the output:

For each generation of the population, the implementation simulates the corresponding phases of the Genetic Algorithm, which are Selection, Reproduction, and Mutation. Different types of populations are linked to different implementations of these phases, for example, for PopulationX (population of individuals of type "X") the particular implementations of the GA phases are:

Generation: 1
------------------------------
Performing one point crossover...
Mutation by bit inversion...
Selection based on elitism
------------------------------

... up to Generation 10

Whereas for the PopulationZ (population of individuals of type "Z") the particular implementations of the GA phases are:

Generation: 1
------------------------------
Performing uniform crossover...
Mutation by boundary...
Selection based on rank
------------------------------

Finally, the individuals of the last generation for each type of population are printed as the output, for example:

Generation: 10
[1000000110]
....

for encoding of PopulationX (binary encoding)

whereas, for PopulationZ (character encoding):

Generation: 10
[ttaatggaaa]
....

Patterns implemented:

- Abstract Factory
  - The pattern provides an interface that is used to create a family of products without specificly telling their classes
  - In the project a family of products are different types of Populations (X and Z, where X contains individuals with genes endoded with binary code, Z is individual creatures whith genes encoded by bases - a, t, g, c)
  - PopulationGenerator is a factory interface for product creation, whereas Crossover is an interface that provides Factory methods. Since crossover operation is the only one intended to create new products we decided to create a factory from this operation only
- Strategy
  - Strategy pattern allows client programmer to select behaviour/algorithm at runtime as well as changing it dynamically during runtime
  - In the current implementation of Genetic Algorithm, Strategy pattern is used to define and inject operation types required for GA, mutation and selection. They are declared as interfaces and have different implementation based on existing methods, i.e. bit inversion for mutation or selection based on rank
  - Interfaces are defined in Population abstract class and they are instanciated when Population is created based on type of Population
- Singleton
  - Singleton class is defined for factory method providers. It is the double-checked locking implementation of the Singleton pattern. This approach provides a thread-safe implementation of the singleton pattern, and prevents that multiple instances of the singleton are created which would break the pattern. It is considered to be the smartest and less resource-intensive (more efficient) implementation of the Singleton pattern. For current project this implementation is feasible since mutation and selection are main operations and the program starts using them from the start.
  - The implementation of the Singleton pattern can be found in the Crossover implementations: OnePoint and Uniform classes.
