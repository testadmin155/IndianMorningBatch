package FirstPackage;

public class IPhone14 implements TROIInterface {
	
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
		
		IPhone14 ip14 = new IPhone14();
		
		ip14.CallDivert();
		ip14.SwitchOn();
		ip14.SwitchOff();
		ip14.CallWaiting();
		ip14.Messages();
		ip14.FaceTIme();
		ip14.Safari();
		ip14.iTunes();
		ip14.OutgingCalls();
		ip14.IncomingCalls();
		ip14.camera();
	}

	

	

}
