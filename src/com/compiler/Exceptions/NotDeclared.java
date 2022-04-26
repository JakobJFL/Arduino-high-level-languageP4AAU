package com.compiler.Exceptions;

import java.util.concurrent.CancellationException;

public class NotDeclared extends CancellationException {
    public NotDeclared() { super("The id is not declared");} { }
    public NotDeclared(String message) {
        super(message);
    } { }
}
