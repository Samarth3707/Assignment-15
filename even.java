package even;
import java.util.*;

public class even {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Number  ");
	        int num = sc.nextInt();
	        checkEvenOdd(num);
	        sc.close();
	    }
	    public static int checkEvenOdd(int num){
	        if (num % 2 == 0) {
	        System.out.println("The entered number is Even");
	        }
	        else {
	            System.out.println("The entered number is odd");
	        }
	        return num;
	    }
	}