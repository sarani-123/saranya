import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		Scanner in=new Scanner(System.in);
		n=in.nextLine();
		//String str[]=n.split(" ");
		int n1=n.length();
		System.out.println(n1);
		
		
		  /*for(int i=n1-1;i>=0;i--) {
		  
		  
		 System.out.print(" " +str[i]);
		  
		  }*/
		 
        String reverse = " ";
        for(int i=n1-1;i>=0;i--)
        {
        	reverse=reverse+n.charAt(i);
        	System.out.println(reverse);
        	
        }
        String rev1=reverse.trim();
        if(n.equals(rev1))
        {
        	System.out.println("It is paalindrome");
        }
        else
        {
        	System.out.println("It is not palinddrome");
        }
        
	}
	}

