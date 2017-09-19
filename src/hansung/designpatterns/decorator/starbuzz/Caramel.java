package hansung.designpatterns.decorator.starbuzz;

public class Caramel extends CondimentDecorator{
    public Caramel(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 카라멜";
    }

    public double cost() {
        return .20 + beverage.cost();
    }

}

