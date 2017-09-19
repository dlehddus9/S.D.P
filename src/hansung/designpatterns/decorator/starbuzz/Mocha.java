package hansung.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {

		return beverage.getDescription() + ", 모카";
	}
 
	public double cost() {

		double cost=beverage.cost();
		if(getSize() == BeverageSize.Tall)
		{
			cost +=.20;

		}
		else if(getSize()==BeverageSize.GRANDE)
		{
			cost+=.25;
		}
		else if(getSize()==BeverageSize.VENTI){
			cost+=.30;
		}
		return .20 + beverage.cost();

	}
}
