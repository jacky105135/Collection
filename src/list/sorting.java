package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		List list = Arrays.asList(s.nextLine());
		String t1 = list.toString();
		String a = t1.replace("[", "");
		String b = a.replace("]", "");
		String[] c = b.split(" ");
		

		for (int i = 0; i < c.length; i++) {
			if(c.length%2 != 0){
				if(i != 0 && i % 2 != 0){
					System.out.print(c[c.length-(i+1)] + " ");
			}
			}else{
				if(i != 0 && i % 2 != 0){
					System.out.print(c[c.length-(i)] + " ");
			}
			}
		}
	}

}
