package com.compiler.Exceptions;

import java.util.concurrent.CancellationException;

public class TypeException extends CancellationException {
    public TypeException() {
        super("Not supported in AHLL");
    } {

    }
    public TypeException(String message) {
        super(message);
    } {

    }
}
