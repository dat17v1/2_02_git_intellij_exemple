package dk.clbo;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Employee("Claus", "221070-1111", 60,  120000));
        persons.add(new Member("Claus", "221070-1111", true));



        for (Person p : persons) {

                System.out.println(p);

        }

        //Employee employee = new Employee("Claus", "221070-1111", 60,  120000);

       /* System.out.println(employee.getName());
        System.out.println(employee.getCpr());
        System.out.println(employee.getHours());
        System.out.println(employee.getSalary()); */
    }
}
