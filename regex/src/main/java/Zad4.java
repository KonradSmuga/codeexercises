import com.sun.tools.javac.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Zad4 {
    private static final String WOMENS_NUM_REG = "^.*a:.*";
    private static String WOMEN_WITH_SURNAME_LUBICZ = ".*a:Lubicz .*";
    private static String PEOPLE_FROM_MAZOWIECKIE = ".* Mazowieckie .*";
    private static String PEOPLE_FROM_MAZOWIECKIE_WITH_WP = ".* Dolnoslaskie .*@wp.pl$";
    private static String GET_STATE_FROM_LINE = ". (.*kie) .*";

    public static void main(String[] args) throws IOException {

        getLinesFromFile();
        printWomensCount(getLinesFromFile());
        printStates(getLinesFromFile());
    }


    public static void printWomensCount(List<String> stringList) {
        Pattern pattern = Pattern.compile(WOMENS_NUM_REG);

        long count = stringList.stream()
                .filter(e -> pattern.matcher(e).matches())
                .count();
    }

    private static List<String> getLinesFromFile() {
        try (BufferedReader bufferedWriter = Files.newBufferedReader(Paths.get("5_wprowadzenie_TWiwala_zad2.txt"))) {
            bufferedWriter.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //. (.*kie) .*
    private static void printStates(List<String> strings) {
        Map<String, Integer> hashMap = new HashMap<>();
        Pattern pattern = Pattern.compile(GET_STATE_FROM_LINE);
        strings.stream()
                .map(e -> {
                    Matcher matcher = pattern.matcher(e);
                    matcher.find();
                    return matcher.group(1);
                })
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(hashMap);
    }
}


//        Pattern pattern = Pattern.compile(GET_STATE_FROM_LINE);
//        for(String line : strings){
//            Matcher matcher = pattern.matcher(line);
//            matcher.find();
//
//            String state =  matcher.group(1);
//            System.out.println(state);
//
//          if(hashMap.containsKey(state)){
//              Integer integer = hashMap.get(state);
//              hashMap.put(state, integer+1);
//          }else{
//              hashMap.put(state, 1);
//          }
//
//          Integer orDefault = hashMap.getOrDefault(state, 0);
//          hashMap.put(state, orDefault+1);
//        }


