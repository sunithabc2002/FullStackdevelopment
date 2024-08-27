package javaassignment;

public class Byte {

	public static void main(String[] args) {
		byte a[][]={{10,20,30},{40,50,60},{70,80,90}};
		int i=0;
		while(i<=a.length-1)
		{	
			int j=0;
			while(j<=a[0].length-1)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
