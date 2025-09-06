package myPackage;

public class FindMax {
  static void max(int arr[]) {
	  int max=arr[0];
	  for(int i=0;i<arr.length;i++) {
		  if(max<arr[i]) max=arr[i];
	  }
	  System.out.println("Maximum value is "+max);
  }
  
  public static void main(String args[]) {
	  int array[]= {26,53,4,82,11};
	  max(array);
  }
}
