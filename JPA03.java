import java.util.Scanner; 
public class JPA03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		for (int i=1;i<=a;i++) {
			b+=i;
			
		}
		System.out.println("1+...+"+a+"="+b);
			

	}

}
