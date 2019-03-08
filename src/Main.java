
public class Main {

	public static void main(String[] args) {
		
		int[] a= {5,89,30,45,21,77,62,456};
		
		int swap;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<(a.length-i-1);j++) {
				if(a[j]>a[j+1]) {
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
