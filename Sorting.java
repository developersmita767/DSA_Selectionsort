class Test
{
	public static void main(String args[])
	{
	  int arr[]={10,8,4,6,9};
	  int i,j,temp;
	  for(i=0;i<arr.length-1;i++)
	  {
	    for(j=i+1;j<arr.length;j++)
	    {
	      if(arr[i]>arr[j])
	      {
	        temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	      }
	    }
	  }
	  System.out.println("after sorting");
	  for(i=0;i<arr.length;i++)
	  {
	   System.out.println(arr[i]);
	  }
	}
}