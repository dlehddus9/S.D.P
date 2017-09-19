package hansung.designpatterns.decorator.starbuzz;

public class Tea extends Beverage {
    public Tea() {
        description = "녹차";
    }

    public double cost() {
        return .99;
    }
}
