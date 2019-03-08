
public class Main {

	public static void main(String[] args) {
		int a[] = { 66, 45, 40, 90, 2, 31, 88, 0 };
		for (int j = 0; j < a.length; j++) {
			int minIndex = j;
			for (int i = j; i < a.length; i++) {
				if (a[i] < a[minIndex]) {
					minIndex = i;
				}
				int temp = a[j];
				a[j] = a[minIndex];
				a[minIndex] = temp;
			}

		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
