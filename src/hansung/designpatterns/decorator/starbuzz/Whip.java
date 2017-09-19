package hansung.designpatterns.decorator.starbuzz;
 
public class Whip extends CondimentDecorator {

 
	public Whip(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return beverage.getDescription() + ",휘핑";
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

		return .10 + beverage.cost();
	}
}
