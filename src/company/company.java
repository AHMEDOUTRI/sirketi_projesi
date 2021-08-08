package company;

    public class company {
    public static void main(String[] args) {
//Fixed monthly salary
        Department d1 = new Department(1,"Iron Workers Department");

        SalaridEmployee se =new SalaridEmployee("AHMED","İstanbul", 257,Gender.male,3000,300,300);
        d1.add_employee(se);
        SalaridEmployee sd =new SalaridEmployee("Sana","Kaysari", 259,Gender.female,3600,200,350);
        d1.add_employee(sd);

        Department d2 = new Department(2,"Carpentry workers department");
        SalaridEmployee sc = new SalaridEmployee("Mohammed","adana",302,Gender.male,4000,500,400);
        d2.add_employee(sc);

        Department d3 = new Department(3,"Sewing Workers Department");
        SalaridEmployee ss= new SalaridEmployee("REEM","Kaysari",366,Gender.female,3400,340,330);
        d3.add_employee(ss);

//hourly salary
        Department d4 = new Department(4,"Accounting");
        HourlyEmployee aa= new HourlyEmployee("saad","azmir",433,Gender.male,75,30);
        d4.add_employee();
//Sales Representative
        Department d5 = new Department(5,"Sales Representative");
        Commission_Employee cc = new Commission_Employee("Murat","İstanbul",467,Gender.male,30,0.10);
        d5.add_employee();

        d1.print_basic_data();
        d1.paint_Alll_details();

        d2.print_basic_data();
        d2.paint_Alll_details();

        d3.print_basic_data();
        d3.paint_Alll_details();

        d4.print_basic_data();
        d4.paint_Alll_details();

        d5.print_basic_data();
        d5.paint_Alll_details();

    }
}
