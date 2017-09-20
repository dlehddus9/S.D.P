package hansung.designpatterns.decorator.starbuzz;

public class DarkRoast extends Beverage {
	public DarkRoast(BeverageSize bSize) {
		description = ""+bSize+"다크 로스트 커피";
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
		return 0.99+cost;
	}
}

