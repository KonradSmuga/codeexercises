package kodillaLambda.beautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemButifier poemButifier = new PoemButifier();
        System.out.println(poemButifier.beautify("asd", (e) -> e.substring(0, 2)));
        System.out.println(poemButifier.beautify("moj Text", (e) -> e.toUpperCase()));
        System.out.println(poemButifier.beautify("moj tekst razy dwa", e -> e.concat(" :próba dodania")));

    }
}
