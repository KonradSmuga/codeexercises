package builder;

import java.util.ArrayList;
import java.util.List;


public class Pizza {
    private String dough;
    private String sauce;
    private String cheese;
    private List<String> ingrediens;

    public Pizza(String dough, String sauce, String cheese, List<String> ingrediens) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.ingrediens = ingrediens;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getIngrediens() {
        return ingrediens;
    }

    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private String cheese;
        private List<String> ingrediens;

        public PizzaBuilder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addingredients(String ingrediens1){
            if(ingrediens == null){
                ingrediens = new ArrayList<String>();
            }
            ingrediens.add(ingrediens1);
                    return this;
        }
        public Pizza bake(){
            return new Pizza(this.bake(), this.sauce(sauce), this.cheese(cheese), this.addingredients(ingrediens));
        }



    }
}
