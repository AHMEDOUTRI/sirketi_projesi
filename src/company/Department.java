package company;

import java.util.ArrayList;

public class Department {
    int dno;
    String dname;
    ArrayList <Employee> emplist;
    public Department(){
    }
    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
         emplist = new ArrayList<Employee>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    //من اجل اضافة او مسح او العمال الجدد
    public void add_employee(Employee e)
    {
        emplist.add(e);
    }
    public void remove_employee(int idx)
    {
        emplist.remove(idx);
    }
    public int getemployeecount()
    {
        return emplist.size();
    }
    public void print_basic_data() {
        for (int i = 0; i < emplist.size(); i++)
        {
            System.out.println(emplist.get(i).getSsn() + "" + emplist.get(i).getName() + "" + emplist.get(i).getSex() + "" + emplist.get(i).getAddress());
        }
    }
    //هي الخطوة منشان نحول منEmployeeللSalaridEmployeehوالبقية منشان تظهر عنديDisplayaaldetails يلي هي عرض التفاصيل
    public void paint_Alll_details() {
        for (int i = 0; i < emplist.size(); i++) {

            if (emplist.get(i) instanceof SalaridEmployee)
                ((SalaridEmployee) emplist.get(i)).Displayaaldetails();
            if (emplist.get(i) instanceof HourlyEmployee)
                ((HourlyEmployee) emplist.get(i)).Displayaaldetails();
            if (emplist.get(i) instanceof Commission_Employee)
                ((Commission_Employee)emplist.get(i)).Displayaaldetails();
        }
    }


    public void add_employee() {
    }
}

