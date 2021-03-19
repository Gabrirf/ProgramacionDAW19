import clases.TryCatch;
import clases.ExceptionTest;

public class Main {
	public static void main(String[] args) {
		/* Try - Catch */
		//TryCatch.indexException();
		//TryCatch.parseException();
		//TryCatch.nullException();
		//TryCatch.mixException();

		/* Exception */
		try {
			//ExceptionTest.throwException();
			ExceptionTest.throwException("Error porque si");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}