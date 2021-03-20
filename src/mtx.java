//Testing
import java.io.*;
import java.util.Collections;
import java.util.HashMap;

public class mtx {
    private static void main (String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);   
        int num_server= Integer.parseInt(br.readLine());
        for (int i=0;i<num_server;i++){
            int num_players=Integer.parseInt(br.readLine());
            int[] power;
            for(int j=0;j<num_players;j++){
                String str=br.readLine();
                String[] values = str.split(" ");
                int skill = Integer.parseInt(values[0]);
                int money = Integer.parseInt(values[1]);
                power.append(skill*(1000+money));
               


            }

        }

    }

}