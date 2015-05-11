import java.util.Scanner;

/** 
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1243
 *
 * @author Damiana Costa
 * **/


public class Problem1243 {

	public static void main(String[] args) {

		Problem1243 e = new Problem1243();
		e.begin();
	}

	private void begin() {

		@SuppressWarnings("resource")
		Scanner entry = new Scanner(System.in);

		while (entry.hasNext()) {

			String d = entry.nextLine();

			if (d.equals(0))
				break;

			validateLetter(d);
		}
	}

	private void validateLetter(String s) {

		int count = 0;
		int letter = 0;
		for (int i = 0; i < s.split(" ").length; i++) {

			if (s.split(" ")[i].matches("^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$")) {
				count++;
				letter = letter+s.split(" ")[i].length();
			}
		}

		try {
			int r;

			if(count == 0) {
				r = 0;	

			} else {
				r = (letter / count);	
			}

			if (r <=3){
				System.out.println("250");

			} else if (r == 4 || r == 5) {
				System.out.println("500");
			} else if (r >=6)
				System.out.println("1000");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}