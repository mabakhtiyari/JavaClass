public class PrimeNumbers {
    public static void main(String[] args) {
        int input = 13;
        if (input==1 || input==0){
            System.out.println("Not Prime");
        }
        else if (input % input == 0 && input % 1 == 0 && input % 2 == 0 && input!=2) {
            System.out.println("Not Prime");

        }

        else {
            System.out.println("Prime");
        }


    }
}
