package company;
enum Gender { male , female};
public abstract class  Employee
{
   String Name;
   String Address;
   int ssn;
   Gender sex;

    public Employee() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public Employee(String name) {
        Name = name;
    }

    public Employee(String name, String address, int ssn, Gender sex) {
        Name = name;
        Address = address;
        this.ssn = ssn;
        this.sex = sex;
    }
public abstract double earnings ();

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", ssn=" + ssn +
                ", sex=" + sex +
                '}';
    }
}

