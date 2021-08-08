package company;

public class HourlyEmployee extends Employee implements Displayable{
   private double houre_rate;
   private int number_of_hours;

    public double getHoure_rate() {
        return houre_rate;
    }

    public void setHoure_rate(double houre_rate) {
        this.houre_rate = houre_rate;
    }

    public int getNumber_of_hours() {
        return number_of_hours;
    }

    public void setNumber_of_hours(int number_of_hours) {
        this.number_of_hours = number_of_hours;
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, String address, int ssn, Gender sex, double houre_rate, int number_of_hours) {
        super(name, address, ssn, sex);
        this.houre_rate = houre_rate;
        this.number_of_hours = number_of_hours;
    }

    @Override
    public double earnings()
{
    return number_of_hours*houre_rate;
}

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "houre_rate=" + houre_rate +
                ", number_of_hours=" + number_of_hours +
                '}';
    }
    public void Displayaaldetails()
    {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    public void Displayearnings()

    {
        System.out.println(earnings());
    }
}
