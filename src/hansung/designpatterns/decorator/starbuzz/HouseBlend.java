package hansung.designpatterns.decorator.starbuzz;

public class HouseBlend extends Beverage {
	public HouseBlend(BeverageSize bSize)
	{
		description = "하우스 블렌드 커피";
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
		return .89+cost;
	}
}

