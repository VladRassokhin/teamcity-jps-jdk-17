package com.github.vladrassokhin.library;

@SuppressWarnings("unused")
public class LibraryClass {
    private final String myInput;

    public LibraryClass() {
        this("");
    }

    public LibraryClass(String input) {
        myInput = input;
    }

    public String getInput() {
        return myInput;
    }
}
