package ass4;

import java.util.Scanner;

public class Tester6 {

	public static void Test(int num) throws InputEx {

		if (num > 100) {
			throw new InputEx("“Number can’t be greater than 100");
		}
	}

	public static void main(String[] args) {

		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter number :");
			int num = obj.nextInt();
			Test(num);
		} catch (InputEx e) {
			System.out.println(e.getMessage());
		}
	}

}