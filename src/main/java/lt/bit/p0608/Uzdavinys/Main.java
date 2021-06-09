package lt.bit.p0608.Uzdavinys;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Isrinkti kiek ir kokiam darbuotjui buvo ismoketa
        // ir isvesti mazejimo tvarka
        //vardas/pavarde - ismoketa suma
        Employee jonas = new Employee("Jonas", "Jonaitis");
        Employee ona = new Employee("Ona", "Ane");
        Employee petras = new Employee("Petras", "Petraitis");


        List<Salary> salaries = new ArrayList<>();
        //jonas add
        salaries.add(new Salary(jonas,100.0, LocalDate.of(2020,1,1)));
        salaries.add(new Salary(jonas,120.0, LocalDate.of(2020,2,1)));
        //ona add
        salaries.add(new Salary(ona,130.0, LocalDate.of(2020,3,1)));
        salaries.add(new Salary(ona,250.0, LocalDate.of(2020,4,1)));
        salaries.add(new Salary(ona,130.0, LocalDate.of(2020,5,1)));
        //petras add
        salaries.add(new Salary(petras,600.0, LocalDate.of(2020,6,1)));

        List<Report> report = new ArrayList<>();
//         Map<Employee, List <Salary>> map =
                 salaries.stream()
                 .collect(Collectors.groupingBy(s-> s.employee()))
                 .forEach((emp, sal) ->  {
                     report.add(new Report (emp, sal.stream()
                             .mapToDouble(s-> s.salary()).sum()));
                 });

        report.stream().sorted(Comparator.comparingDouble((Report r) -> r.salary)
                .reversed()).forEach(record->
                System.out.println(record.employee.firstName()+ " " +
                        record.employee.lastName() + " " +
                        record.salary));

    }

    static class Report {
        Employee employee;
        Double salary;


        public Report(Employee employee, Double salary) {
            this.employee = employee;
            this.salary = salary;
        }
    }
}


