import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee ("Mihaela", 3200));
        employeeList.add(new Employee ("Alex", 4000));
        employeeList.add(new Employee ("Alexandra", 2000));
        employeeList.add(new Employee("Andrei", 6000));
        employeeList.add(new Employee ("Raul", 2800));
        int sumSalary = 0;
        for (Employee e : employeeList) {

            if (e.getName().startsWith("A") && e.getSalary() > 3000) {
                sumSalary += e.getSalary();
            }

        }
            System.out.println("The costs with for: " + sumSalary);
    }
}
