package FirstPackage;

public class Switch {

	public static void main(String[] args) {
		
		/*String Studentname="Anees";
		//System.out.println(Studentname);
		
		if(Studentname=="farhana")
		{
			System.out.println("call farhana");
		}
		
		else if(Studentname=="Sravanthi")
		{
			System.out.println("call Sravanthi");
		}
		
		else if(Studentname=="Rajani")
		{
			System.out.println("call Rajani");
		}
		else if(Studentname=="Tazeen")
		{
			System.out.println("call Tazeen");
		}
		else if(Studentname=="Sudha")
		{
			System.out.println("call Sudha");
		}
		else if (Studentname=="Sridevi")
		{
			System.out.println("Sridevi");
		}
		
		else
		{
			System.out.println("goto sleep");
		}*/
		
		//switch statement
		String Studentname="Sridevi";
		switch(Studentname)
		{
		case "farhana":
			System.out.println("call farhana");
		case "sravanthi":
			System.out.println("call Sravanthi");
		case "Rajani":
			System.out.println("call Rajani");
		case "Tazeen":
			System.out.println("call Tazeen");
		case "Sudha":
			System.out.println("call Sudha");
		case "Sridevi":
			System.out.println("call Sridevi");
			
			default:
				System.out.println("goto sleep");
		}
		
		

	}

}
