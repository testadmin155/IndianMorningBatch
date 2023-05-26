package FirstPackage;

public class IPhone15 implements TROIInterface {
	
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
		System.out.println("112 MP");
	}


	
	public static void main(String[] args) {
		
		IPhone15 ip15 = new IPhone15();
		
		ip15.CallDivert();
		ip15.SwitchOn();
		ip15.SwitchOff();
		ip15.CallWaiting();
		ip15.Messages();
		ip15.FaceTIme();
		ip15.Safari();
		ip15.iTunes();
		ip15.OutgingCalls();
		ip15.IncomingCalls();
		ip15.camera();
	}

	

	

}
