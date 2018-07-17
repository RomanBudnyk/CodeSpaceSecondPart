package codespace.workB25.task2;

public class Runner2 {
    public void run() {
        new Employee();
        new Employee("Ivan", "Petrov");
        new Employee("Sergiy", "Ivanov", "cleaner", 4448778);
        new Employee("Elizaveta", "Vetrova");
        new Employee("Roman", "Martyniuk", "developer", 468465546);
        System.out.println("Count of employees = " + Employee.getNumberOfEmployees());
    }
}

