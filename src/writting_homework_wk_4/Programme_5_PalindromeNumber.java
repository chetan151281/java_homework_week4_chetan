package writting_homework_wk_4;

import java.util.Scanner;

public class Programme_5_PalindromeNumber {
    public static boolean isPallindrome(int number){
        //converts negative number to positive number
        if(number < 0){
            number = - number;
        }
        int lastDigit, reverse = 0,temp;
        temp = number;
        while (number > 0){
            // Stores the last digit
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number /10;
        }
        return reverse == temp;
    }

    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ");
        int a = scanner.nextInt();
        boolean check = isPallindrome(a);
        //checks number is palindrome or not
        if (check)
            System.out.println("Numbver is palindrome");
        else
            System.out.println("Number is not Palindrome");
        // closing the scanner object
        scanner.close();
    }

}
