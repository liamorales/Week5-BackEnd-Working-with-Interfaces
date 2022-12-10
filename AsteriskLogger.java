package workingInterfacesW5;

public class AsteriskLogger implements Logger {
	
	@Override
	public void warning (String warning) {
		System.out.println("***Warning***" + ":" + warning);
	}
	
	@Override
	public void error (String error) {
		System.out.println("****************");
		System.out.println();
		System.out.println("*** ERROR:" + ":" + error + "***");
		System.out.println();
		System.out.println("****************");
	}
	

}
