import builder.Pizza;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("grube", "pomidorowy", "parmezan", Arrays.asList("szynka", "boczek", "pieczarki"));

        new Pizza.PizzaBuilder()
                .cheese("doug")
                .dough("gruby");



    }
}
