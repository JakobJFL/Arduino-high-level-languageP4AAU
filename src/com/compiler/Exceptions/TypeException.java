package com.compiler.Exceptions;

import java.util.concurrent.CancellationException;

public class TypeException extends CancellationException {
    public TypeException() {
        super("An unknown type error occurred");
    } {}
    public TypeException(String message) {
        super(message);
    } {}
}
