public class Machine {
	State initialState;
	State insertCardState; // we need this state when we insert the card.
	State cardScannedState;
	State cardVerificationState;
	State carWashOptionState;
	State receiptOptionState;
	State fuelDispensionState;
	State receiptPrintingState;
	
	State state;
	
	boolean printReceipt; // we may need more variables
	
	/* constructor */
	public Machine() {
		initialState = new InitialState(this);
		insertCardState = new InsertCardState(this); // we need this state when we insert the card.
		cardScannedState = new CardScannedState(this);
		cardVerificationState = new CardVerificationState(this);
		carWashOptionState = new CarWashOptionState(this);
		receiptOptionState = new ReceiptOptionState(this);
		fuelDispensionState = new FuelDispensionState(this);
		receiptPrintingState = new ReceiptPrintingState(this);
		
		state = initialState;
		
		printReceipt = true;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void insertCard() {
		state.insertCard();
	}
	
	public void removeCard() {
		state.removeCard();
	}
	
	public void buttonA() {
		state.next();
	}
	
	public void buttonC() {
		state.confirm();
	}
	
	public void buttonD() {
		state.reject();
	}
	
	public void buttonG() {
		state.help();
	}
	
	public void buttonH() {
		state.cancel();
	}
	
	public void keypad(String zipcode) {
		//may be a class, discuss this later
		state.keypad(zipcode);
	}
	
	public void fuelButtonA() {
		
	}
	
	public void fuelButtonB() {
		
	}
	
	public void fuelButtonC() {
		
	}
	
	public State getState() {
		return state;
	}
	
	public State getInitialState() {
		return initialState;
	}
	
	public State getInsertCardState() { // we need this state when we insert the card.
		return insertCardState; 
	}
	
	public State getCardScannedState() {
		return cardScannedState;
	}	
	
	public State getCardVerificationState() {
		return cardVerificationState;
	}	
	
	public State getCarWashOptionState() {
		return carWashOptionState;
	}
	
	public State getReceiptOptionState() {
		return receiptOptionState;
	}
	
	public State getFuelDispensionState() {
		return fuelDispensionState;
	}
	
	public State getReceiptPrintingState() {
		return receiptPrintingState;
	}	

}