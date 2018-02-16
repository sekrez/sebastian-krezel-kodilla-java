package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautifly(String poem, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(poem);
        System.out.println(result);
    }
}
