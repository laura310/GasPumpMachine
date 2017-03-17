public class CarWashOptionState implements State {
	  Machine machine;
	  
	  public CarWashOptionState(Machine machine) {
		  this.machine = machine;
	  }
	  
	  public void insertCard() {
		  
	  }
	  
	  public void removeCard() {
		  
	  }
	  
	  public void next() {
		  
	  }
	  
	  public void confirm() {
		  machine.setState(machine.fuelDispensionState);
		  System.out.println("Select fuel type and refuel your car");
	  }
	  
	  public void reject() {
		  machine.setState(machine.receiptOptionState);
		  System.out.println("Do you want to print the receipt?");
	  }
	  
	  public void help() {
		  
	  }
	  
	  public void cancel() {
		  
	  }
	  
	  public void keypad(String zipcode) {
			//may be a class, discuss this later
	  }
}