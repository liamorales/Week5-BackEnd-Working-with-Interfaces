package workingInterfacesW5;

public class SpacedLogger {

	public void warning (String warning) {
		for (int i=0; i<warning.length(); i++) {
			System.out.print(warning.charAt(i)+ " ");
		}
	}
	
	public void error(String error) {
		System.out.print("ERROR: ");
			for (int i =0; i<error.length(); i++) {
				System.out.print(error.charAt(i)+ " ");
			}
		
	}
}
