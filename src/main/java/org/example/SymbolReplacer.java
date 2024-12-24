package org.example;

public class SymbolReplacer implements ReplaceSymbolA, ReplaceSymbolB {

    public String replaceSymbolA(String input) {
        return input.replace('a', 'Z');
    }


    public String replaceSymbolB(String input) {
        return input.replace('b', 'w');
    }
}