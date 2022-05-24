# High-level Language for Arduino

This repository is a compiler for the language HLMP (High-level Microcontroller Programming) and was developed as a 4th semester project at Aalborg University.

## Directory Guide
The project contains the following directories: 

* inputCode/ contains two txt files with code written in the HLMP language.
* src/com/compiler/ contains main.java and all other classes we have implemented including the context-free grammar (Hlmp.g4).
* tests/com/tests contains the tests for the project.
* pom.xml contains the dependency injections for ANTLR
* gen/com/compiler/ contains the generated code from ANTLR.
* output/ contains the generated code from the compiler.

## Getting Started
Before the compiler can be run, the ANTLR plugin needs to be installed. Information about this, can be found in pom.xml.

In src/com/compiler/main.java, the directory path for the input code can be specified on line 21. The main.java should be run. The compiler will generate the output code in output/output.ino. The compiler is tested on Java v17.
