
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
 /** 
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1110
 *
 * @author Damiana Costa
 * **/

public class Main {
 
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("");
 
        try {
            while (true) {
 
                int n = entrada.nextInt();
                if (n == 0)
                    break;
 
                Queue<Integer> fila = new LinkedList<Integer>();
                for(int i=1; i<n+1; i++){
                    fila.add(i);
                }
                sb.append("Discarded cards:");
                boolean f = false;
 
                while(fila.size() > 1){
                    if(f)
                        sb.append(",");
                    sb.append(" ").append(fila.remove());
                    fila.add(fila.remove());
                    f = true;
                }
                sb.append("\n");
                sb.append("Remaining card: ").append(fila.remove()).append("\n");
            }
            System.out.print(sb);
        } catch (Exception e ) {
            System.out.println("error");
        }
 
    }
}