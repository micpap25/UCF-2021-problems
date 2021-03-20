package old;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;

public class naughty {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        int years = Integer.parseInt(br.readLine());

        for (int i = 0; i < years; i++) {
            String[] vals = br.readLine().split(" ");
            int houses = Integer.parseInt(vals[0]);
            int days = Integer.parseInt(vals[1]);
            HashMap<Integer, Integer> pranksByHouse = new HashMap<>();
            for (int j = 0; j < days; j++){
                String[] lineVals = br.readLine().split(" ");
                int location = Integer.parseInt(lineVals[0]) - 1;
                int freq = Integer.parseInt(lineVals[1]);
                int num = Integer.parseInt(lineVals[2]);
                for (int k = 0; k < num; k++){
                    if (pranksByHouse.containsKey(location)){
                        pranksByHouse.put(location, pranksByHouse.get(location) + 1);
                    } else {
                        pranksByHouse.put(location, 1);
                    }
                    location += freq;
                    if (location > houses) {
                        break;
                    }
                }
            }
            int maxPranks = Collections.max(pranksByHouse.values());
            int max = 0;
            for (int j = 0; j < houses; j++){
                if (pranksByHouse.get(j) != null && pranksByHouse.get(j).equals(maxPranks)) {
                    max = j;
                    break;
                }
            }
            pw.println("House " + (max + 1) + " should get the biggest and best gift next Christmas.");
        }
        br.close();
        pw.close();
    }
}
