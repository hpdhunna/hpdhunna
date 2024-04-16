package Assignments4;

public class Employeepayroll {
    int employeeId;
    String emplyeename;
    double basicsalary;
    String designation;

    public Employeepayroll(int employeeId, String emplyeename, double basicsalary, String designation) {
        this.employeeId = employeeId;
        this.emplyeename = emplyeename;
        this.basicsalary = basicsalary;
        this.designation = designation;
    }

    public double calculateGrosssalary(){
        return basicsalary;
    }
    public double calculateDeductions() {
        double deductionPercentage = 0.20;
        return basicsalary * deductionPercentage;
    }
    public double calculatenetsalary()
    {
        return calculateGrosssalary()-calculateDeductions();
    }
    public void Displaydetails()
    {
        System.out.println("Emplyee id" + this.employeeId);
        System.out.println("Emplyee name" + this.emplyeename);
        System.out.println("Basic salary" +basicsalary);
        System.out.println("Designation" +this.designation);

    }

    public static void main(String[] args) {
        Employeepayroll emp1 = new Employeepayroll(236,"john",6000,"developer");
//        emp1.Displaydetails();
        System.out.println(emp1.calculateDeductions());
        System.out.println(emp1.calculateGrosssalary());
        System.out.println(emp1.calculatenetsalary());

    }
}

