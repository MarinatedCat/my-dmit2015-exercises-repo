package dmit2015.model;

public class LoanSchedule {

	private int paymentNumber;
	private double interestPaid, principalPaid,remainingBalance;
	
	public LoanSchedule() {
		paymentNumber = 1;
		interestPaid = 0;
	    principalPaid = 0;
	    remainingBalance = 0; 
	}

	public LoanSchedule(int paymentNumber, double interestPaid, double principalPaid, double remainingBalance) {
		super();
		this.paymentNumber = paymentNumber;
		this.interestPaid = interestPaid;
		this.principalPaid = principalPaid;
		this.remainingBalance = remainingBalance;
	}

	public int getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(int paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	public double getInterestPaid() {
		return interestPaid;
	}

	public void setInterestPaid(double interestPaid) {
		this.interestPaid = interestPaid;
	}

	public double getPrincipalPaid() {
		return principalPaid;
	}

	public void setPrincipalPaid(double principalPaid) {
		this.principalPaid = principalPaid;
	}

	public double getRemainingBalance() {
		return remainingBalance;
	}

	public void setRemainingBalance(double remainingBalance) {
		this.remainingBalance = remainingBalance;
	}
	@Override
	public String toString() {
		return "LoanSchedule [paymentNumber=" + paymentNumber + ", interestPaid=" + interestPaid + ", principalPaid="
				+ principalPaid + ", remainingBalance=" + remainingBalance + "]";
	}
	 
}
