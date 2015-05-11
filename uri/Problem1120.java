import java.math.BigInteger;
import java.util.Scanner;


/** 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1120
 *
 * @author Damiana Costa
 * **/

public class Problem1120 {

	public static void main(String[] args) {

		Problem1120 m = new Problem1120();
		m.begin();
	}

	@SuppressWarnings("resource")
	void begin() {

		Scanner entry = new Scanner(System.in);

		while (entry.hasNext()) {

			String d = entry.next();
			String n = entry.next();

			if (d.equals("0") && n.equals("0")) 
				break;
			addData(d,n);
		}
	}

	private void addData(String d, String n) {
		String s;
		if (n.replace(d, "").isEmpty()) {
			s = "0";

		} else { 
			s = n.replace(d, "");
		}
		BigInteger b = new BigInteger(s);
		System.out.println(b);
	}
}