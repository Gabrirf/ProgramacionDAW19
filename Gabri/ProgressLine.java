public class ProgressLine{
	public static void main(String[] args) {
		String progress = "";
		for (int i=0; i<30 ; i++ ) {
			progress += "-";
			System.out.print("\r"+progress);
			try{
				Thread.sleep(100);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}