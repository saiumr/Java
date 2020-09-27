public class ForSum {
	public static void main(String[] args) {
		int n = 100;
		int sum = 0;
		
		while(n != 0) {
			sum += n;
			--n;
		}
		
		System.out.println(sum);
		System.out.println(sum == 5050 ? "AC" : "FA");
	}
}
