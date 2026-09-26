import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        int num = n, sum = 0;

        while (num != 0) {
            int d = num % 10;
            sum += d * d * d;
            num /= 10;
        }

        if (sum == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}   