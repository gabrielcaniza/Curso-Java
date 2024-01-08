package Entities;

public class Individual extends TaxPayer {

    public Double healthexpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthexpenditures) {
        super(name, anualIncome);
        this.healthexpenditures = healthexpenditures;
    }

    public Double getHealthexpenditures() {
        return healthexpenditures;
    }

    public void setHealthexpenditures(Double healthexpenditures) {
        this.healthexpenditures = healthexpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.0) {
            return getAnualIncome() * 0.15 - healthexpenditures * 0.5;
        } else {
            return getAnualIncome() * 0.25 - healthexpenditures * 0.5;
        }
    }

}
