package hansung.designpatterns.decorator.starbuzz;

public class Espresso extends Beverage {
  
	public Espresso(BeverageSize bSize) {

		description = ""+bSize+"에스프레소";
		setSize(bSize);
	}
  
	public double cost() {
		double cost=0;
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
		return 1.99 + cost;

	}
}

