# deck-of-cards
Java deck of cards library.

## Dependencies

Maven is required to build this project.

## Instructions

To compile and run tests:

    mvn test
    
To compile and build jar file:

    mvn package

## Usage

My solution provides a Card class representing a playing card along with an
abstract deck that can be used as a base class for implementing different
deck types for different types of card games. The shuffle() and dealOneCard()
methods can be found in the AbstractDeck class. Unit tests can be found in
src/test.
