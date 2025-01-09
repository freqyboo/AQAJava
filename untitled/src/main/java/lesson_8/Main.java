package lesson_8;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alex Beleya", 30, 30000, "+787778787", "example@mail.com", "Vice-president");
        emp.getInformation();

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("John Pork", 40, 99999, "+666666666", "johnpork@gmail.com", "CEO");
        empArray[1] = new Employee("Gerry McReary", 52, 50000, "+7142858", "gerr@mail.com", "Janitor");
        empArray[2] = new Employee("Patrick McReary", 46, 70000, "+421844888", "example@mail.com", "Business Accountant");
        empArray[3] = new Employee("Francis McReary", 59, 85000, "+424144441", "fmcr@gmail.com", "Manager");
        empArray[4] = new Employee("Derrick McReary", 65, 20000, "+4233145634", "dmcr@gmail.com", "Senior Manager");

        for (int i = 0; i<empArray.length; i++)
        {
            System.out.println((i+1));
            empArray[i].getInformation();
        }

    }

}
