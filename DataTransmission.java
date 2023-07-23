import java.util.Scanner;

public class DataTransmission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		String code1[] = code.split(" ");
		int arr[] = new int[code1.length];
		for(int i = 0; i < code1.length; i++) {
			arr[i] = Integer.parseInt(code1[i]);
		}
		
		int[] result = primeArray(arr);
		int secondLagest = findSecondLargest(result);
		int fResult = secondLagest + result.length;
		System.out.println(fResult);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	
	static int findSecondLargest(int a[]) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length - 2];
	}
	
	static int[] primeArray(int[] a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(isPrime(a[i])) {
				count++;
			}
		}
		int result[] = new int[count];
		count = 0;
		for(int i = 0; i < result.length; i++) {
			if(isPrime(a[i]))
			result[count++] = a[i];
		}
		return result;
	}
	
	static boolean isPrime(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count > 2) {
			return false;
		}
		else {
			return true;
		}
	}

}