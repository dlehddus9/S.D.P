package hansung.designpatterns.decorator.starbuzz;

public class Vanilia extends CondimentDecorator{
    public Vanilia(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 바닐라";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}



