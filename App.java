public class App {

  public static void main(String[] args) {
    Person person = new Person(7, "Dat");
    Employee employee = new Employee(7, "Dat", 50000.0f);
    person.Display();
    employee.Display();
    System.out.println();
  }
}

class Person {

  private int id;
  private String name;

  public Person() {
    id = 0;
  }

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void Display() {
    System.out.println("ID : " + id + "  Name : " + name);
  }
}

class Employee extends Person {

  private float salary;

  public Employee() {
    salary = 0.0f;
  }

  public Employee(int id, String name, float salary) {
    super(id, name);
    this.salary = salary;
  }

  public void Display() {
    super.Display();
    System.out.println("Salary : " + salary);
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }
}
