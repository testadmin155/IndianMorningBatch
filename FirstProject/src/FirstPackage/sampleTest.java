package FirstPackage;

public class sampleTest {

	public static void main(String[] args) {
		
		String text = "This is for knowing the for location for in same for line";
		String wordToFind = "for";
		
		/*int firstIndex = text.indexOf(word);
		int secondIndex = text.indexOf(word, firstIndex+1);
		
		System.out.println(secondIndex);*/
		
		String[] words =text.split(" ");
		
		for(int i=0; i<words.length; i++)
		{
			if (words[i].equals(wordToFind))
			{
				System.out.println("word found at position : " + i );
			}
		}

	}

}
