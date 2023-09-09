package GeneralExample;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1);
		for (int i = 0; i <=8; i++) {
	
		System.out.print(fibonacci(i) + " "); 
		}
	}

	static void print(int n) {

		if (n <= 6) {
			System.out.println(n);
			print(n + 1);
		}
	}
	static int fibonacci(int n) {
		if (n<2) {
			return n;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);

		}
		
	}
	
	


