import java.util.Scanner;

public class EndtermActivityEncaps{

  public static void main(String args[]){

    EncapsulationSequence obj = new EncapsulationSequence(); // Creates a new object and assigns the variable into "obj."
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.next();
    obj.setEmpName(name);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    obj.setEmpAge(age);

    System.out.print("Enter your SSN: ");
    int ssn = sc.nextInt();
    obj.setEmpSSN(ssn);

    System.out.print("Enter employee rate: ");
    double rate = sc.nextDouble();
    obj.setEmpRate(rate);

    System.out.print("Enter number of days worked: ");
    int daysWorked = sc.nextInt();
    obj.setEmpDaysWorked(daysWorked);

    System.out.println("Employee Name: " + obj.getEmpName());
    System.out.println("Employee SSN: " + obj.getEmpSSN());
    System.out.println("Employee Age: " + obj.getEmpAge());
    System.out.println("Employee Gross Pay: ₱" + obj.empPay());
  }
}

// Form different Getters and Setters from a new Method.
class EncapsulationSequence{ // This is a Method.
  private int ssn;
  private String empName;
  private int empAge;
  private double empRate;
  private int empDaysWorked;

  // This is the Getter lines.
  public int getEmpSSN(){
    return ssn;
  }

  public String getEmpName(){
    return empName;
  }

  public int getEmpAge(){
    return empAge;
  }

  public double getEmpRate(){
    return empRate;
  }

  public int getEmpDaysWorked(){
    return empDaysWorked;
  }

  // This is the Setter lines.
  public void setEmpAge(int newValue){
    empAge = newValue;
  }

  public void setEmpName(String newValue){
    empName = newValue;
  }

  public void setEmpSSN(int newValue){
    ssn = newValue;
  }

  public void setEmpRate(double newValue){
    empRate = newValue;
  }

  public void setEmpDaysWorked(int newValue){
    empDaysWorked = newValue;
  }

  // This is the gross pay formula.
  public double empPay(){
    return empRate * empDaysWorked;
  }
}