package hansung.designpatterns.factory.pizzaaf;

public class Korea59RicePizzaIngredientFactory implements PizzaIngredientFactory {



    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }               //여기에 원하는 재료들 을 집어넣으면됨

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
