package ass4;

import java.util.Scanner;

public class Tester5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter the number : ");
			int num = obj.nextInt();
			if (num > 100)
				throw new Exception();
		} catch (Exception e) {
			System.out.println("No. cannot be greater than 100");
		}
	}

}