package builder.pizza;

import builder.pizza.pizzaType.Capri;
import builder.pizza.pizzaType.Pizza2;
import builder.pizza.pizzaType.Waiter;

import java.util.ArrayList;
import java.util.List;

public class PizzaRunner {
    public static void main(String[] args) {
//        List<String> capriIngredients = new ArrayList<>();
//        capriIngredients.add("ham");
//        capriIngredients.add("cheese");
//
//        List<String> hawaiIngredients = new ArrayList<>();
//        hawaiIngredients.add("pineapple");
//        hawaiIngredients.add("ham");
//        hawaiIngredients.add("cheese");
//
//        List<String> marinaraIngredient = null;
//

//        Pizza2 capriciosa = new Capri();
//        Pizza2 marinara = new Pizza2(P);


        Waiter waiter = new Waiter();
        waiter.setChef(new Capri());
        waiter.getPizza();
    }

}
