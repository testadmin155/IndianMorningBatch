package FirstPackage;

public class NestedForLoop {

	public static void main(String[] args) {
		
		/*
		1 2 3 4
		5 6 7
		8 9
		10
		*/

		/*int k=1;
		for(int j=0;j<4;j++)
		{
			for (int i=1;i<=4-j;i++)
			{
				//System.out.print(i+" ");
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}
		*/
		
		/*
		1
		2 3
		4 5 6
		7 8 9 10
		*/
		/*int k =1;
		for (int j=1;j<=4;j++)
		{
			for (int i=1; i<=j;i++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
			
		}*/
		
		
		/*
		1
		1 2
		1 2 3
		1 2 3 4
		*/
		for (int j=1;j<=4;j++)
		{
			for(int i=1; i<=j;i++)
			{
				System.out.print(i);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
	}

}
