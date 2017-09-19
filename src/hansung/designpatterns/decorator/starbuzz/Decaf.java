package hansung.designpatterns.decorator.starbuzz;

public class Decaf extends Beverage {
	public Decaf(BeverageSize bSize)
	{
		description = "디카페인 커피";
		setSize(bSize);
	}
 
	public double cost() {
		return 1.05;
	}
}

