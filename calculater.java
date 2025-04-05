import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int firstNum = input.nextInt();
        System.out.print("Enter second number:");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;
        System.out.print("addition of two number  " +  sum);
    }
}