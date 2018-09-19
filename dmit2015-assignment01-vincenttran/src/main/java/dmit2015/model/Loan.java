package dmit2015.model;

public class Loan {
	
	private double mortgageAmount,annualInterestRate;
	private int amortizationPeriod;
	
	public Loan() {
		mortgageAmount = 0;
		annualInterestRate = 0;
		amortizationPeriod = 0;
	}

	public Loan(double mortageAmount, double annualInterestRate, int amortizationPeriod) {
		super();
		this.mortgageAmount = mortageAmount;
		this.annualInterestRate = annualInterestRate;
		this.amortizationPeriod = amortizationPeriod;
	}
	public static double roundTo2Decimals(double valueToRound){
        return Math.round( valueToRound * 100 ) / 100.0;
  }
   public double getMonthlyPayment() {
	   return mortgageAmount * ((Math.pow((1 + annualInterestRate / 200),(1/6)) -1) /
			   Math.pow((1 - (((Math.pow((1 + annualInterestRate / 200),(1/6)))))),(-12 * amortizationPeriod)));
   }
   public LoanSchedule[] getLoanScheduleArray() {
	   
   }
	

}
