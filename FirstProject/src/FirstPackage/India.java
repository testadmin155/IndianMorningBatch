package FirstPackage;

public class India extends NHAuthority{

	public static void main(String[] args) {
		
		India obj = new India();
		obj.GreenLight();
		obj.RedLight();
		obj.OrangeLight();
		obj.GreenLightTime();
		obj.RedLightTime();
		obj.OrangeLightTime();

	}

	@Override
	public void RedLightTime() {
		System.out.println("wait for 20 secs");
		
	}

	@Override
	public void GreenLightTime() {
		System.out.println("wait for 60 secs");
		
	}

	@Override
	public void OrangeLightTime() {
		System.out.println("wait for 5 secs");
		
	}

}
