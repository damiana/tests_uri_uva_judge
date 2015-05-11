import java.util.Scanner;

/** 
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1234
 *
 * @author Damiana Costa
 * **/

public class Problem1234 {

	public static void main(String[] args) {

		Problem1234 e = new Problem1234();
		e.begin();
	}

	private void begin() {

		@SuppressWarnings("resource")
		Scanner entry = new Scanner(System.in);		
		while (entry.hasNext()) {

			String d = entry.nextLine();
			String word = "";
			boolean isLower = false;
			if (d.length() >=1 && d.length() <=50) {
				
				for (int i = 0; i < d.length(); i++) {
				
					if (d.charAt(i) == ' ') {
						word = word + String.valueOf(d.charAt(i));
						continue;
						
					} else {
						if (isLower) {
							word = word + String.valueOf(d.charAt(i)).toLowerCase();
							isLower = false;
							
						} else {
							word = word + String.valueOf(d.charAt(i)).toUpperCase();
							isLower = true;
						}
					}
				
				}
			}
			System.out.println(word);
		}
	}
}