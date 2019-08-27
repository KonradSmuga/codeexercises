package builder.pizza.pizzaType;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Waiter {

    private Chef chef;

    public Pizza2 getPizza() {
        chef.buildNewPizza();

        chef.buildIngredients();
        chef.buildSauce();
        chef.buildDough();


        return chef.getPizza();
//        BigDecimal.valueOf(40000.234);
    }
}

