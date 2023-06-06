import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employeefilterandsort {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee("Anand"));
        employees.add(new Employee("Aman"));
        employees.add(new Employee("John"));
        employees.add(new Employee("Junny"));
        List<Employee>filterAndSortedEmployees=employees.stream()
                .filter(e->e.getName().startsWith("A"))
                        .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        System.out.println("filtered and sorted Employees:");
        for(Employee employee:filterAndSortedEmployees){
            System.out.println(employee.getName());
        }

    }
}
