package com.mshildt.cards;

/**
 * Exception class for exception thrown when there is an attempt to deal cards
 * from a deck that has no cards left.
 */
public class EmptyDeckException extends Exception {

    /**
     * {@inheritDoc}
     */
    public EmptyDeckException(String message) {
        super(message);
    }

    /**
     * {@inheritDoc}
     */
    public EmptyDeckException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
