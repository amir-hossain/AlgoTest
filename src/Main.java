
public class Main {

	public static void main(String[] args) {
		int[] input= {1,56,66,89,90,99,100};
		String result=binarySearch(100,input,0,input.length);
		System.out.println(result);

	}

	private static String binarySearch(int i,int[] input,int low,int high) {
		

		int mid=(low+high)/2;
		while(low<high) {
			if(input[mid]==i) {
				return "found";
			}else if(input[mid]>i) {
				return binarySearch(i,input,low,mid);
			}else if(input[mid]<i) {
				return binarySearch(i,input,mid+1,high);
			}
		}
		
		return "no data found";
		
	}

}
