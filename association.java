class Department {
    String name;
    Department(String name) { this.name = name; }
}
public class AssociationDemo {
    public static void main(String[] args) {
        Department d = new Department("CS");
        Student s = new Student("Bob", d);
        System.out.println(s.name + " " + s.dept.name);
    }
}
class Student {
    String name;
    Department dept;
    Student(String name, Department dept) { this.name = name; this.dept = dept; }
}
