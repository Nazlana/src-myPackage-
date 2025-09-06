package myPackage;

public class MultiDimensionalArray {
	public static void main(String args[]) {
		//System.out.println("Members:");
		int arr[][]= {{1,2,3},{5,9,8}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
