package hansung.designpatterns.factory.pizzafm;

public class Korea59RiceBytePizza extends Pizza {
    public Korea59RiceBytePizza() {

        name = "Bite Gold Pizza   ";
        dough = "Cheese Crust";
        sauce = "Plum Cream Sauce";

        toppings.add("Sweet Potato Moose");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
