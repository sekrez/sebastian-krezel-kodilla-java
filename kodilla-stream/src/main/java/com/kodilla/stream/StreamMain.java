package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautifly("cosik tam cosik tam i działa_1", (String) -> "ABC " + String + " ABC");
        poemBeautifier.beautifly("a teraz cos z innej mańki", (String) -> String.toUpperCase());
        poemBeautifier.beautifly("String jako cycat", (String) -> "Cycat: \"" + String + "\"");
        poemBeautifier.beautifly("Ciekawe ile znaków znajduje się w tym zdaniu?", (String) -> "Badane zdanie \"" + String + "\"" + " - zawiera: " + Integer.toString(String.length()) + " znaków");
        poemBeautifier.beautifly("Pozbywamy się spacji w tym zdaniu i podziwiamy jak to teraz wygląda", (String) -> "|" + String.replace(" ", "|") + "|");
    }
}