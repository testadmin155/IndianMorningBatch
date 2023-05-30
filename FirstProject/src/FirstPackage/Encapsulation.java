package FirstPackage;

public class Encapsulation {
	// the process of grouping variables and corresponding Methods in to a single nit is called Encapsulation
	// Encapsulation is also called a data hidding
	// this is used for security reasons and to save from hackers
	//getters and Setters methods are used for Encapsulation
	// rightclick - source - generate getters and setters.
	
	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getAdhraNumber() {
		return adhraNumber;
	}

	public void setAdhraNumber(int adhraNumber) {
		this.adhraNumber = adhraNumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	private int phonenumber;
	private int adhraNumber;
	private String emailid;
	private String Name;
	String address;

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.phonenumber=464;
		obj.adhraNumber=867645;
		obj.emailid="fsgf@gmail.com";
		obj.Name="wsdgvefg";
		obj.address="wgvaegfv";
	}

}
