import java.util.*;
public class basic_calcjava {

	public static void main(String[] args) {
		
		float n1,n2,button,cal;
		System.out.println("Enter two number ");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println("Select Opertion ");
		button = sc.nextInt();
		
		if(button==1) {
			cal = n1 + n2;
			System.out.println("Adittion = "+cal);
		}else if(button==2) {
			cal = n1 - n2;
			System.out.println("Substraction = "+cal);
		}else if(button==3) {
			cal = n1*n2;
			System.out.println("Multiplication = "+cal);
		}else if(button==4) {
			cal = n1/n2;
			System.out.println("Division = "+cal);
		}else if(button==5) {
			cal = n1%n2;
			System.out.println("Modulus = "+cal);
		}else {
			System.out.println("Invalid Operation");
		}
		
		System.out.println("*******  *     *      *        *       *  *    *      *    *  ");
		System.out.println("   *     *     *     *  *      * *     *  *  *        *    *  ");
		System.out.println("   *     *******    ******     *   *   *  **          *    *  ");
		System.out.println("   *     *     *   *      *    *     * *  *  *        *    *  ");
		System.out.println("   *     *     *  *        *   *       *  *    *      ******  ");
		
		

	}

}
