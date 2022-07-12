package week1.day1;

public class findIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated me=thod stub
		int a1[]= {1,2,3,4,5};
		int a2[]= {6,7,8,9,1};
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j]) {
					System.out.println(a1[i]);
				}
			}
		}

	}

}
