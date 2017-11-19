package hansung.designpatterns.templatemethod.barista;


public abstract class CaffeineBeverageWithHook {
 
	final void prepareRecipe() {
		boilWater();
		dutchWater();
		brew();
		store(); //숙성
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
 
	abstract void brew();

	protected void store() {
	}
	abstract void addCondiments();

	void dutchWater() {
		System.out.println("더치 커피 숙성");
	}
 
	void boilWater() {
		System.out.println("Boiling water");
	}
 
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	boolean customerWantsCondiments() {
		return true;
	}
}
