public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(calcFactorial(num));
    }

    public static int calcFactorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        else {
            return n*(n-1)*(n-2)*(n-3)*1;
        }
    }
}
