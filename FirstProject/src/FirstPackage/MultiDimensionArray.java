package FirstPackage;

public class MultiDimensionArray {

	public static void main(String[] args) {
		
		/*
		2 4 5 7
		3 4 7 8
		1 2 6 9
		*/
		
		//int[] x = {2,4,5,7,3,4,7,8,1,2,6,9};
		int[][] x ={ {2,4,5,7},{3,4,7,8},{1,2,6,9}};
		
		//System.out.println(x[1][2]);
		
		for(int row =0; row<3;row++)
		{
			for(int column=0;column<4;column++)
			{
			System.out.print(x[row][column]);
			System.out.print("\t");
			}
			System.out.println();
		}
		
		

	}

}
