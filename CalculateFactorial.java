public class CalculateFactorial {
    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
    }
    public static int calcFactorial(int x){
        int temp=1;
        int result=1;
        while (temp<=x){
            result=result*temp;
            temp++;
        }
        return result;
    }
}
