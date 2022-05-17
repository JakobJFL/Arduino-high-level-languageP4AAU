package com.compiler.Exceptions;

import java.util.concurrent.CancellationException;

public class SyntaxException extends CancellationException {
    public SyntaxException() {super("An unknown syntax error occurred");} {}
    public SyntaxException(String message) {super(message);} {}
}
