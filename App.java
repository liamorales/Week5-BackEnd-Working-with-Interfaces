package workingInterfacesW5;

public class App {
	public static void main (String [] args) {
		AsteriskLogger war1 = new AsteriskLogger();
		war1.warning("We have a warning!");
		war1.error("ummmm ERROR!");
		
		SpacedLogger epp = new SpacedLogger();
		epp.warning("It works!");
		epp.error("We have output");
	}

}
