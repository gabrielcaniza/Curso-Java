package Entities;

public class BussinessAccount extends Account {
    private double LoanLimit;

    public BussinessAccount() {
        super();
    }

    public BussinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        LoanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return LoanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        LoanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= LoanLimit) {
            balance += amount - 10;
        }
    }

}
