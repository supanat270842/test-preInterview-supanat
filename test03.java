//ข้อที่ 2
import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		Scanner gj = new Scanner(System.in);
		int num = gj.nextInt();
		System.out.println("SquareDigits(" + num + ") " +  SquareDigits(num));
	}

	public static int SquareDigits(int n) {
		
		String ITS = Integer.toString(n);
		String name_ar[] = ITS.split("");
		
		String name3 = "";
		
		for(String name_loop : name_ar) {
			int STI = Integer.parseInt(name_loop);
			
			STI = (int) Math.pow(STI, 2);
			name3 += Integer.toString(STI);		
		}
		n = Integer.parseInt(name3);
		return n;
	}

}
