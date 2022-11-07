import java.util.Scanner;

public class Main {
    static int num;
     static int up = 0;
    static String b;
    static int result = 0;
    static int left = 0;
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nEnter number");
        num = read.nextInt();
        System.out.println("\nEnter add or mul");
        b = read.next();
                while (left < num) {
                    while (up < num) {
                        switch (b) {
                            case "add" -> result = left + up;
                            case "mul" -> result = left * up;
                        }
                            System.out.print(result % num + " ");
                            up++;
                            result = 0;
                        }
                        left++;
                        up = 0;
                        System.out.print("\n");
                    }
    }
}