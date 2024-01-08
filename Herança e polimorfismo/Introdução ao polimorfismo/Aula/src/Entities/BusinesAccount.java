package Entities;

public class BusinesAccount extends Account {
    private double LoanLimit;

    public BusinesAccount() {
    }

    public BusinesAccount(Integer number, String holder, Double balance, double loanLimit) {
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

    @Override
    public void Withdraw(double amount) {
        super.Withdraw(amount);
        balance -= 2.0;

    }

}
