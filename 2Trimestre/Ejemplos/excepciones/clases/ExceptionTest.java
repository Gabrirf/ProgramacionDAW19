package clases;

public class ExceptionTest {

	public static void throwException() throws Exception {
		throw new Exception();
	}

	public static void throwException(String text) throws Exception {
		throw new Exception(text);
	}

}