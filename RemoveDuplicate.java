package week1.day1;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="saranya murugesan";
		char[] string=string1.toCharArray();
		int count;
		System.out.println("Duplicate characters in a given string: ");  
		for(int i=0;i<string.length;i++)
		{
			count=1;
			for(int j=i+1;j<string.length;j++)
			{
				//System.out.println(arr[i]+" =="+arr[j]);
				if(string[i]==string[j] && string[i]!= ' ')
				{
					count++;
					//To stop printng the repeating values
					string[j]='0';
				//System.out.println("the duplicate element"+arr[j]);
				
				}
				
			}
			
			  if(count <= 1 && string[i]!='0')
			  {
				  System.out.print(string[i]);
				  }
			 
		}
		
		
		  
	}
}


