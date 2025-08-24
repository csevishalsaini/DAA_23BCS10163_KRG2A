import java.util.*;

public class pow {
    public double solve(double x, long n) {
        if (n <= 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            return solve(x * x, n / 2);
        } else {
            return x * solve(x * x, (n - 1) / 2);
        }
    }

    public double myPow(double x, int n) {
        long k = n;
        if (k < 0) {
            x = 1 / x;
            k = -k;
        }
        return solve(x, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        pow sol = new pow();
        double result = sol.myPow(x, n);
        System.out.println(result);
        sc.close();
    }
}
