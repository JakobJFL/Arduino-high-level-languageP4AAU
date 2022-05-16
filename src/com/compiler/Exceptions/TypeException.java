package com.compiler.Exceptions;

import java.util.concurrent.CancellationException;

public class TypeException extends CancellationException {
    public TypeException() {
        super("is not supported in HLMP");
    } {

    }
    public TypeException(String message) {
        super(message);
    } {

    }
}
