import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
3
        int x = scanner.nextInt(); // Capacity of Lab L1
        int y = scanner.nextInt(); // Capacity of Lab L2
        int z = scanner.nextInt(); // Capacity of Lab L3
        int n = scanner.nextInt(); // Number of students in the class

        if (n <= x) {
            System.out.println("L1");
        } else if (n <= y) {
            System.out.println("L2");
        } else if (n <= z) {
            System.out.println("L3");
        } else {
            System.out.println("None of the labs can accommodate this class.");
        }
    }
}
