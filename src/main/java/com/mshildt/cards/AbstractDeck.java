package com.mshildt.cards;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Abstract deck class containing common methods among deck implementations.
 */
public abstract class AbstractDeck {
    protected List<Card> cards;

    /**
     * Shuffles all cards in the deck.
     */
    public void shuffle() {
        for(int i = cards.size() - 1; i > 0; i--) {
            //
            // Get random index between index 0 and our current position.
            //
            int swapIndex = ThreadLocalRandom.current().nextInt(0, i + 1);

            //
            // Swap current position element with element from swapIndex.
            //
            Card temp = cards.get(i);
            cards.set(i, cards.get(swapIndex));
            cards.set(swapIndex, temp);
        }
    }

    /**
     * Deals one card from the top of the deck.
     * @throws DeckExhaustedException if the deck is empty.
     * @return Card from the top of the deck.
     */
    public Card dealOneCard() {
        Card card = cards.remove(0);
        return card;
    }

    /**
     * Returns true if this deck has more cards.
     * @return true if this deck has more cards.
     */
    public boolean hasMoreCards() {
        return !cards.isEmpty();
    }

    /**
     * Prints the cards in the deck to stdout.
     */
    public void printCards() {
        for (Card card : cards) {
            System.out.println(card);
        }

    }

    /**
     * Implemented by subclasses to initialize the deck with cards.
     */
    abstract void initCards();
}
