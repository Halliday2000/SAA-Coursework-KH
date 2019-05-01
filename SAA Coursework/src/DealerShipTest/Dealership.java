package DealerShipTest;

public class Dealership {
	
	private String Make;
	private String Reg;
	private String Model;
	private String Colour;
	
	public static String NewMake() {
		String Manufac;
		Manufac = Input.getString("Enter The new Make/Manufacturor: ");
		return Manufac;
	}
}
