package Entities;

//final antes da classe impede ela de ser herdada
public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    // final antes do impede de ser Sobreposto, pode ser entrada pra inconsistencia.
    @Override
    public final void Withdraw(double amount) {
        balance -= amount;
    }

}
