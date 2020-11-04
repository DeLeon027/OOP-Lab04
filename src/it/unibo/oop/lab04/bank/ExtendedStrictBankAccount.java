package it.unibo.oop.lab04.bank;

public class ExtendedStrictBankAccount extends SimpleBankAccount {
	
    private static final double TRANSACTION_FEE = 0.1;
	
	private int nTransactions;

	public ExtendedStrictBankAccount(int usrID, double balance) {
		super(usrID, balance);
		this.nTransactions=0;
	}
	
	 private boolean isWithdrawAllowed(final double amount) {
	        return getBalance() > amount;
	    }
	
	@Override
	public void computeManagementFees(final int usrID) {
        final double feeAmount = MANAGEMENT_FEE + (nTransactions * TRANSACTION_FEE);
        if (checkUser(usrID) && isWithdrawAllowed(feeAmount)) {
            setBalance(getBalance() - feeAmount);
            nTransactions = 0;
        }
    }
	
	@Override
	 public void withdraw(final int usrID, final double amount) {
	        if (isWithdrawAllowed(amount)) {
	           super.withdraw(usrID, amount);
	        }
	    }

}
