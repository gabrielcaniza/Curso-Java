public class Dados {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary() {
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage) {
        double increaseAmount = GrossSalary * (percentage / 100);
        this.GrossSalary += increaseAmount;
    }
}
