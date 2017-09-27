package hansung.designpatterns.factory.pizzafm;

public class Korea59RiceHotspicyPizza extends Pizza{
    public Korea59RiceHotspicyPizza() {
        name = "Hot Spice Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Hot Chilly Souce";

        toppings.add("Grilled Barbecue");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
