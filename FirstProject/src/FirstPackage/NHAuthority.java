package FirstPackage;

public abstract class NHAuthority {
	
	public void GreenLight()
	{
		System.out.println("Only GO");
	}

	public void RedLight()
	{
		System.out.println("Stop");
	}
	
	public void OrangeLight()
	{
		System.out.println("Wait");
	}
	
	public abstract void RedLightTime();
	public abstract void GreenLightTime();
	public abstract void OrangeLightTime();
	
	public static void main(String[] args) {
		
		

	}

}
