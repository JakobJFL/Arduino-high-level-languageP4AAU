package com.compiler.Exceptions;

import java.util.concurrent.CancellationException;

public class SyntaxException extends CancellationException {
    public SyntaxException() {
        super("Not supported in HLMP");
    } {

    }
    public SyntaxException(String message) {
        super(message);
    } {

    }
}
