package FirstPackage;

public class Iphone13 implements TROIInterface {
	
	@Override
	public void SwitchOn() {
		System.out.println("Press left Button");
		
	}

	@Override
	public void SwitchOff() {
		System.out.println("Press Right Button");
		
	}

	@Override
	public void IncomingCalls() {
		System.out.println("scroll Right side");
		
	}

	@Override
	public void OutgingCalls() {
		System.out.println("scroll Left side");
		
	}

	@Override
	public void Messages() {
		System.out.println("this is a Maessage");
		
	}

	@Override
	public void CallDivert() {
		System.out.println("this is a CallDivert");
		
	}
	
	@Override
	public void CallWaiting() {
		System.out.println("this is a CallWaiting");
		
	}
	
	public void FaceTIme()
	{
		System.out.println("This is a FaceTime");
	}
	
	public void Safari()
	{
		System.out.println("This is a Safari");
	}
	
	public void iTunes()
	{
		System.out.println("This is a iTunes");
	}
	
	public void camera()
	{
		System.out.println("64 MP");
	}


	
	public static void main(String[] args) {
		
		Iphone13 ip13 = new Iphone13();
		
		ip13.CallDivert();
		ip13.SwitchOn();
		ip13.SwitchOff();
		ip13.CallWaiting();
		ip13.Messages();
		ip13.FaceTIme();
		ip13.Safari();
		ip13.iTunes();
		ip13.OutgingCalls();
		ip13.IncomingCalls();
		ip13.camera();
	}

	

	

}
