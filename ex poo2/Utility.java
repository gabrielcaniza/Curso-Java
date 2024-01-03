public class Utility {
    public double dolar;
    public double price;
    public double cotacao;

    public static double currencyConverter(double dolar, double cotacao) {
        return cotacao * dolar + (cotacao * dolar * 0.06);
    }
}
