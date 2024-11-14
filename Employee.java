package entities;

public class Employee {
  public String name;
  public double grossSalary;
  public double netSalary2;
  public double tax;
  public double percentage;
  
  public double netSalary() {
    return grossSalary - tax;
  }
  public double increaseSalary() {
	  return (grossSalary * (percentage * 0.01)) + (grossSalary - tax);
  }
}
