package hansung.designpatterns.factory.pizzafm;

public class Korea59RiceSweetpotatoPizza extends Pizza {

    public Korea59RiceSweetpotatoPizza() {
        name = "Sweet Potato Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Sweete Garil Sauce";

        toppings.add("Mashed Potato");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
