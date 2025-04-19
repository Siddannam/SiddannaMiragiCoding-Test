import java.util.Scanner;
public class program3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (a): ");
            int a = scanner.nextInt();

            int count = (a % 2 == 0) ? a - 1 : a;
            int num = 1;

            for (int i = 0; i < count; i++) {
                System.out.print(num);
                if (i != count - 1) {
                    System.out.print(", ");
                }
                num += 2;
            }

            scanner.close();
        }
    }

