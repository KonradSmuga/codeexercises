package kodillaLambda.beautifier;

public class PoemButifier {

    public String beautify(String text, PoemDecorator poemDecorator){


        return poemDecorator.decorate(text);
    }
}
