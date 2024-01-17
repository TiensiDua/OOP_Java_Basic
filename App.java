import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    int age;
    float time;
    String name;

    System.out.print("Enter your name: ");
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();

    System.out.print("Enter your age: ");
    age = scanner.nextInt();

    System.out.print("Enter your time: ");
    time = scanner.nextFloat();

    System.out.println(
      "Hello " +
      name +
      " you are " +
      age +
      " years old and you spend " +
      time +
      " hours a day."
    );
  }
}
