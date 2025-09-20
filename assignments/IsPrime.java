package week1.day2.assignmentss;

public class IsPrime {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; 
            
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        //FinAL Validation
        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
    }
}