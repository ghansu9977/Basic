import java.util.Scanner;

class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Spy number: ");
        int n = sc.nextInt();
        int r = 0;
        int sum = 0;
        int m = 1;
        while (n != 0) {
            r = n % 10;
            sum = sum + r;
            m = m * r;
            n /= 10;
        }
        if (sum == m) {
            System.out.println("this is a Spy number.");
        } else {
            System.out.println("this is not a Spy number.");
        }
    }
}