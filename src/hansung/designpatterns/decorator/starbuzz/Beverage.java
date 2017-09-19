package hansung.designpatterns.decorator.starbuzz;

public abstract class Beverage {
	public String description = "Unknown Beverage";
	private BeverageSize size;
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();

	public void setSize(BeverageSize size)
	{
		this.size=size;

	}
	public BeverageSize getSize()
	{
		return this.size;
	}
}
