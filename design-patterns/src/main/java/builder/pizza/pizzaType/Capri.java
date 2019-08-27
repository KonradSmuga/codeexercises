package builder.pizza.pizzaType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class Capri extends Chef {


    @Override
    public void buildDough() {
        pizza.setDough("cienkie");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("lagodne");
    }

    @Override
    public void buildIngredients() {

    }

    @Override
    public void setName() {

    }
}
