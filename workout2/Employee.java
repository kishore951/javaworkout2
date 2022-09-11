import java.util.Scanner;

class employee {
    static int empno;
    static double salary,totalsalary;
    employee(double salary){
        empno++;
        System.out.println("Employee number="+empno);
        this.salary=salary;
        System.out.println("salary="+salary);
        totalsalary=salary+totalsalary;

    }
    static void disp(){
        System.out.println("Total number of employee="+empno);
        System.out.println("Total salary of all employee="+totalsalary);
    }
}
class employx{
    public static void main(String args[]){
        float a1,a2,a3,a4;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first employee salary");
        a1=s.nextFloat();
        employee e1=new employee(a1);
        System.out.println("Enter the second employee salary");
        a2=s.nextFloat();
        employee e2=new employee(a2);
        System.out.println("Enter the third employee salary");
        a3=s.nextFloat();
        employee e3=new employee(a3);
        System.out.println("Enter the fourth employee salary");
        a4=s.nextFloat();
        employee e4=new employee(a4);
        employee.disp();
    }
}
