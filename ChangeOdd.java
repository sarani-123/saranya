package week1.day1;

public class ChangeOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="saranya";
		char[] a=name.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				a[i]=Character.toUpperCase(a[i]);
			}
		}
		System.out.println(a);

	}

}
