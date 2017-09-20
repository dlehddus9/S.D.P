package hansung.designpatterns.decorator.starbuzz;

public class Decaf extends Beverage {
	public Decaf(BeverageSize bSize)
	{
		description = ""+bSize+"디카페인커피";
		setSize(bSize);

		setSize(bSize);
	}
 
	public double cost() {
		return 1.05;
	}
}

