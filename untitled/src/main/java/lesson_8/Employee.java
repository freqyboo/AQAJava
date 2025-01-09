package lesson_8;

public class Employee {
    String fullName;
    String job;
    String email;
    String phoneNumber;
    int salary;
    int age;


    public Employee(String fullName, int age, int salary, String phoneNumber, String email, String job) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.job = job;
    }

    public void getInformation()
    {
        System.out.println("Full Name: " + this.fullName +
        "\n" +
                "Age: " + this.age +
                "\n" +
                "Salary: " + this.salary +
                "\n" +
                "Phone Number: " + this.phoneNumber +
                "\n" +
                "Email: " + this.email +
                "\n" +
                "Job: " + this.job);
    }


}
