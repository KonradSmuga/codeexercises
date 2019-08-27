package builder.pizza.pizzaType;

public abstract class Chef {

    protected Pizza2 pizza;

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildIngredients();

    public void buildNewPizza(){
      Pizza2 pizza = new Pizza2();
    }

    public Pizza2 getPizza(){
        return pizza;

    }
    public abstract void setName();

}
