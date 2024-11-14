package application;

import entities.Employee;
import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.printf("Employee: %s, $ %.2f%n",employee.name,employee.netSalary());
		System.out.print("Which percentage to increase salary? ");
		employee.percentage = sc.nextDouble();
		System.out.printf("Update data: %s, $ %.2f", employee.name, employee.increaseSalary());

		sc.close();
	}
}
