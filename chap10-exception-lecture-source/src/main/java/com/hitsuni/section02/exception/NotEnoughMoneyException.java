package com.hitsuni.section02.exception;

public class NotEnoughMoneyException extends NegativeException {

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
