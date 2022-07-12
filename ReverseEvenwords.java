package week1.day1;

public class ReverseEvenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="java is platform independent language";
		String[] word1=word.split(" ");
		//String reverse= " ";
		for(int i=0;i<word1.length;i++)
		{
		   if(i%2!=0)
		   {
			   
			  System.out.print(word1[i]);
		}
		   else
		   {
			   //System.out.println(word1[i]);
			   int evenword=word1[i].length();
			   char[] str=word1[i].toCharArray();
			   for(int j=evenword-1;j>=0;j--)
			   {
				   System.out.print(str[j]);
			   }

		   }
		}

	}

}
