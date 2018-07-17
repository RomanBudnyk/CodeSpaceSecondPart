package codespace.workB25.task2;

public class Employee {
    private static int numberOfEmployees;
    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;


    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getOccupation() {
        return occupation;
    }
    public int getTelephone() {
        return telephone;
    }

    public Employee(String firstName, String lastName, String occupation, int telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }

    public Employee() {
        this("NoName", "NoSurname", "no", 5552233);
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, "no", 5552233);
    }

    {
        numberOfEmployees++;
    }
}
