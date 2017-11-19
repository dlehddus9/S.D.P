package hansung.designpatterns.state.gumballstatewinner;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		int count=5;
		GumballMachine gumballMachine = 
			new GumballMachine(10);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();



		System.out.println(gumballMachine);
		gumballMachine.reFill(count);
		int total=gumballMachine.count;
		System.out.println(+count+"개가 리필되었습니다."); //count가 5개면 5개가 리필되고
		System.out.println("현재"+total+"개가 있습니다."); //리필이 되서 총 개수를 출력

		/*gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);*/
	}
}
