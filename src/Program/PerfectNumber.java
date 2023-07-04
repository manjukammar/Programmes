package Program;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=28;//6,28,496
	    int sum =0;
		for (int i = 1; i <= no; i++) {
			
			if(no%i==0){
				sum=+i;
			}
		}
		if(sum==no){
			System.out.println("Its perfect number "+sum);
		}else {
			System.out.println("Its not a perfect number "+sum);
		}
	}

}
