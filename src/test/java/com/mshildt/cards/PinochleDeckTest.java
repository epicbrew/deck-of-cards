package com.mshildt.cards;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for PinochleDeck.
 */
public class PinochleDeckTest {

    @Test
    public void canConstruct() {
        PinochleDeck deck = new PinochleDeck();
        assertEquals(48, deck.numCards());
    }
}
