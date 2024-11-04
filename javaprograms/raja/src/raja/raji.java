package raja;

public class raji {

	public static void main(String[] args) {
		
     int[] a=new int[]{1,2,3,4};//initializing first array with values.
    int b[]=new int [a.length];//initializing second array with first array length size.
    for(int i=0;i<=a.length-1;i++)
    {
    	b[i]=a[i];//copying first array elements to second array
    }
    System.out.println("elements in first array are");
    for(int i=0;i<=a.length-1;i++)
    {
    	System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println("elements in second array are");
    for(int i=0;i<=b.length-1;i++)
    {
    	System.out.print(b[i]+" ");
    }

	}

}
