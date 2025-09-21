class Person {
    void role() {
        System.out.println("A person has a role in society");
    }
}

class Student extends Person {
    @Override
    void role() {
        System.out.println("Student studies in a school or university");
    }
}

class Teacher extends Person {
    @Override
    void role() {
        System.out.println("Teacher educates students");
    }
}

class Doctor extends Person {
    @Override
    void role() {
        System.out.println("Doctor treats patients");
    }
}

public class Polymorphism_11 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Student();
        Person p3 = new Teacher();
        Person p4 = new Doctor();

        p1.role();
        p2.role();
        p3.role();
        p4.role();
    }
}
