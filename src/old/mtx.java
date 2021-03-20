package old;//Testing
import java.io.*;
import java.util.Collections;
import java.util.HashMap;

public class mtx {
    public static void main (String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);   
        int num_server= Integer.parseInt(br.readLine());
        for (int i=0;i<num_server;i++){
            int num_players=Integer.parseInt(br.readLine());
            int maxPower = -1;
            boolean f2p = true;
            for (int j = 0; j < num_players; j++) {
                String[] values = br.readLine().split(" ");
                int skill = Integer.parseInt(values[0]);
                int money = Integer.parseInt(values[1]);
                int power = skill * (1000 + money);
                if (power > maxPower || (power == maxPower && money > 0)) {
                    maxPower = power;
                    f2p = money == 0;
                }
            }
            if (f2p) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
        }
    }
}