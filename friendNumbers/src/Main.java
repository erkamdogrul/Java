import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOne, numberTwo;
        int sumOne = 0;
        int sumTwo = 0;
        Scanner sc = new Scanner(System.in);
        numberOne = sc.nextInt();
        numberTwo = sc.nextInt();
        sc.close();
        System.out.println(numberOne + " " + numberTwo);
        for (int i = 1; i <= numberOne / 2; i++) {
            if (numberOne % i == 0) {
                sumOne += i;
            }
        }
        for (int j = 1; j <= numberTwo / 2; j++) {
            if (numberTwo % j == 0) {
                sumTwo += j;
            }
        }
        if (sumOne == numberTwo && sumTwo == numberOne) {
            System.out.println(numberOne + " " + numberTwo + " are friend numbers.");
        }else{
            System.out.println(numberOne + " " + numberTwo + " are not friend numbers.");
        }
    }
}