public class Commission extends Hourly
{
    protected double sales;
    protected double rateCom;
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double rateIn)
    {
        super(eName,eAddress,ePhone,socSecNumber,rate);
        sales = 0;
        rateCom = rateIn;

    }
    public void addSales (double totalSales)
    {
        sales += totalSales;
    }

    public double pay()
    {
        double payment = super.pay() + (sales * rateCom);
        sales = 0;

        return payment;
    }

    @Override
    public String toString() {
        String returnString =  super.toString() + "\nSales:" + sales;
        return returnString;
    }
}
