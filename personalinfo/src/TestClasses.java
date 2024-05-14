class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    private String status;

    public Student(String name, String status) {
        super(name);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + getName();
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String office, double salary, MyDate dateHired) {
        super(name);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + getName();
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + getName();
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String office, double salary, MyDate dateHired, String title) {
        super(name, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + getName();
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

public class TestClasses {
    public static void main(String[] args) {
        Person person = new Person("cali");
        Student student = new Student("axmed", Student.FRESHMAN);
        Employee employee = new Employee("xasan", "Office 101", 50000, new MyDate(1, 1, 2020));
        Faculty faculty = new Faculty("sade", "Office 102", 70000, new MyDate(2, 2, 2018), "9am-5pm", "Professor");
        Staff staff = new Staff("maxamed", "Office 103", 40000, new MyDate(3, 3, 2019), "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

