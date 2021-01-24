
public class TimeMachine {
	
	public void goToFuture(int currentYear) {
		currentYear = currentYear + 10;
		System.out.println(currentYear);
		
	}
	public void goToPast(int currentYear) {
		currentYear = currentYear - 10;
		System.out.println(currentYear);
		
	}

	public static void main(String[] args) {
		TimeMachine machine = new TimeMachine();
		int currentYear = 2020;
		machine.goToPast(currentYear);
		
		machine.goToFuture(currentYear);

		
	}

}
