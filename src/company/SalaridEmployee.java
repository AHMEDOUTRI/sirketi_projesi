package company;

public  class  SalaridEmployee extends Employee implements Displayable
{
    double salary;
    double bonus;
    double deductions;


    public SalaridEmployee(){
    }
    public SalaridEmployee(String name, String address, int ssn, Gender sex, double salary, double bonus, double deductions) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    @Override
    public double earnings()
    {
        return (salary + bonus )-deductions;
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

    @Override
    public String toString() {
        return "SalaridEmployee{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", deductions=" + deductions +
                '}';
    }
}

