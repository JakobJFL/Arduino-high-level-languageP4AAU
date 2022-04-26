package com.compiler.Exceptions;

import java.util.concurrent.CancellationException;

public class AlreadyDeclared extends CancellationException {
    public AlreadyDeclared() { super("The id is already declared FUCK");} { }
    public AlreadyDeclared(String message) {
        super(message);
    } { }

}
