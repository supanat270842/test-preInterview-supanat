//ข้อที่ 3
import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner gj = new Scanner(System.in);
		String a = gj.nextLine();
		System.out.print(a +  " ==> ");

		String ar[] = a.split(" ");
		
		for (int i = 0; i < ar.length; i++) {
			String v[] = ar[i].split("");
			
			for (int j = v.length-1; j >= 0; j--) {
				System.out.print(v[j]);
				
			}
			
			System.out.print(" ");
		}
	}

}
