package FirstPackage;

public class Belgium extends NHAuthority {

	
	public static void main(String[] args) {
		
		Belgium obj = new Belgium();

		obj.GreenLight();
		obj.RedLight();
		obj.OrangeLight();
		obj.GreenLightTime();
		obj.RedLightTime();
		obj.OrangeLightTime();
		
	}

	@Override
	public void RedLightTime() {
		System.out.println("wait for 45 secs");
		
	}

	@Override
	public void GreenLightTime() {
		System.out.println("go for 30 secs");
		
	}

	@Override
	public void OrangeLightTime() {
		System.out.println("wait for 10 secs");
		
	}

}
