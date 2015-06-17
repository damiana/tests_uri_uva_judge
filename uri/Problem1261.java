import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/** 
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1261
 *
 * @author Damiana Costa
 * **/

public class Problem1261 {

	public static void main(String[] args) throws IOException {
		Problem1261 e = new Problem1261();
		e.begin();
	}

	private void begin() {

		@SuppressWarnings("resource")
		Scanner entry = new Scanner(System.in);

		while (entry.hasNext()) {

			String input = entry.nextLine();
			HashMap<String, String> hashWords = new HashMap<String, String>();

			int countWord = Integer.parseInt(input.split(" ")[0]);
			int countDescription = Integer.parseInt(input.split(" ")[1]);

			if (countWord <=1000 && countDescription <=100) {
				for (int i = 0; i < countWord; i++) {
					String s = entry.nextLine();
					hashWords.put(s.split(" ")[0], s.split(" ")[1]);
				}

				for (int i = 0; i < countDescription; i++) {
					int result = 0;

					String line;
					while (!(line = entry.nextLine()).equals(".")) {
						String lines[] =  line.split(" ");
						
						for(Entry<String, String> e : hashWords.entrySet()) {
							for (int j = 0; j < lines.length; j++) {

								if (lines[j].equals(e.getKey())) {
									result = result + Integer.parseInt(e.getValue());
								}
							}
						}
					}
					System.out.println(result);
				}
			}
		}
	}
}