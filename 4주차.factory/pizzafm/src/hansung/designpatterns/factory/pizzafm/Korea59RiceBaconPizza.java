package hansung.designpatterns.factory.pizzafm;

public class Korea59RiceBaconPizza extends Pizza{

    public Korea59RiceBaconPizza() {
        name = "Bacon Potato Pizza";
        dough = "Cheese Crust";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
