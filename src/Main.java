public class Main {

	public static void main(String[] args) {
		int[] a= {85,32,45,87,8,1,369,45,1};
		for(int i=1;i<a.length;i++) {
			int j=i;
			while(j>0) {
				if(a[j]<a[j-1]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
				j--;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
