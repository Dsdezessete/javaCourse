package Application;

import Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Reading data

        System.out.print("How many employees will be registred? ");
        int e = sc.nextInt();
        List <Employee> list = new ArrayList<>();

        for(int i=0; i<e; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println("-----------------------------");

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        // Update salary of given employee

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // Listing employees

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee x: list) {
            System.out.println(x);
        }

        sc.close();

    }
    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
