package week1.day2.assignmentss;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12345;   // given number
        int originalvalue = num;
        int reversedvalue = 0;

        // reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedvalue = reversedvalue * 10 + digit;
            num = num / 10;
        }
        
        if (originalvalue == reversedvalue) {
            System.out.println(originalvalue + " is a Palindrome.");
        } else {
            System.out.println(originalvalue + " is not a Palindrome.");
        }
    }
}