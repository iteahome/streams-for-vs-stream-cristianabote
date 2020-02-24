import java.util.ArrayList;
import java.util.List;

public class AplicationStream {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mihaela", 3200));
        employeeList.add(new Employee("Alex", 4000));
        employeeList.add(new Employee("Alexandra", 2000));
        employeeList.add(new Employee("Andrei", 6000));
        employeeList.add(new Employee("Raul", 2800));
        int sum = employeeList.stream()
                .filter(employee -> employee.getName().startsWith("A"))
                .filter(employee -> (employee.getSalary() > 3000))
                .mapToInt(employee -> employee.getSalary())
                .sum();
        System.out.println("The costs with streams: " + sum);
    }
}
