//this assumes that there's no State interface to be implemented.

/**
 * Ask customers if they want their receipt after:
 * Car Wash option is "No".
 *
 *
 */

public class ReceiptOptionState {
	GasPumpMachine gasPumpMachine;

	public ReceiptOptionState(GasPumpMachine gasPumpMachine) {
		this.gasPumpMachine = gasPumpMachine;
	}
}