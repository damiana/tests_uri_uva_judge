import java.util.Scanner;


/** 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1632
 *
 * @author Damiana Costa
 * **/

public class Problem1632 {

	public static void main(String[] args) {

		Problem1632 m = new Problem1632();
		m.begin();
	}

	private void begin() {

		@SuppressWarnings("resource")
		Scanner entry = new Scanner(System.in);
		int possible = 1;
		while (entry.hasNext()) {


			String d = entry.next();

			if (d.equals(0))
				break;

			for (int i = 0; i < Integer.parseInt(d); i++) {
				String c = entry.next();

				if(c.length() >= 1 && c.length() <= 16) {			
					for(int p = 0; p < c.length(); p++) {

						if(canChangeToNumber(c.charAt(p))) {
							possible *= 3;
						} else {
							possible *= 2;
						}
					}
					System.out.println(possible);
					possible = 1;
				}
			}
		}
	}


	static boolean canChangeToNumber(char letter) {

		boolean isPossible = false;

		switch ( letter ) {
		case 'A':
			isPossible = true;
			break;
		case 'a':
			isPossible = true;
			break;
		case 'E':
			isPossible = true;
			break;
		case 'e':
			isPossible = true;
			break;
		case 'I':
			isPossible = true;
			break;
		case 'i':
			isPossible = true;
			break;
		case 'O':
			isPossible = true;
			break;
		case 'o':
			isPossible = true;
			break;
		case 'S':
			isPossible = true;
			break;
		case 's':
			isPossible = true;
			break;

		default:
			isPossible = false;
			break;
		}

		return isPossible;		
	}
}