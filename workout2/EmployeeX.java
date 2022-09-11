
import java.util.*;
class EmployeeX{
    int empId,a1,a2,a3;
    String fName,result;
    EmployeeX();{
        Scanner s=new Scanner(System.in);
        System.out.println("enter the Employee ID");
        empId=s.nextInt();
        System.out.println("enter the Field name");
        fName=s.nextInt();
        System.out.println("enter the Assessment 1");
        a1=s.nextInt();
        System.out.println("enter the Assesment 2");
        a2=s.nextInt();
        System.out.println("enter the Assesment 3");
        a3=s.nextInt();
    }
    void result(){
        if(a1>=75&&a2>=75&&a3>=75)
        {
            System.out.println(empId+"\t is promoted");
        }
        else
        {
            System.out.println(empId+"\t is not Demoted");
        }
    }
    void call(){
        double total=a1+a2+a3;
        double per=(total/300)*100;
        System.out.println(total mark obtained:"+total);
        System.out.println("percentage obtained:"+per);
    }
    class employeeId{
        public static void main(String[] args){
            EmployeeX ep=new EmployeeX();
            ep.result();
            ep.call();
        }
    }
