package com.mshildt.cards;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Represents a deck of cards with one of each card.
 */
public class DefaultDeck {

    private ArrayList<Card> cards;

    public DefaultDeck() {
        initCards();
    }

    /**
     * Initializes internal list/deck of cards. Initialized cards are in an
     * unspecified, but unshuffled order.
     */
    private void initCards() {
        cards = new ArrayList<>();

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

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

    public Card dealOneCard() {
        Card card = cards.remove(0);
        return card;
    }

    public void printCards() {
        for (Card card : cards) {
            System.out.println(card);
        }

    }
}
