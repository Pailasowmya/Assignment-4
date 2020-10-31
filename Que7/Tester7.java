package ass4;

import java.io.IOException;

public class Tester7 {

	public static void main(String[] args) {

		DemoException exception = new DemoException();
		try {
			exception.throwException();
		} catch (InputException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
