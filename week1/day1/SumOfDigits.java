package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		
		// Declare your input number (int)
		int num = 153,remainder=0,quotient=0;
		// Initialize an integer variable by name: sum
		int sum =0;
		// Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0
		while (num>0) {
			// Within loop: get the remainder when done by 10 -> Tip: use mod %
            remainder=num%10;
         // Print the remainder to confirma
            System.out.println("remainder "+remainder);
         // Within loop: add that remainder to the sum
            sum=sum+remainder;
         // Print the sum to confirm
            System.out.println("sum "+sum);
         // Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
           quotient= num/10;
           num=quotient;
           System.out.println("quotient "+quotient);
		}
		// Outside the loop: print the final sum
		System.out.println(sum);

	}

}
