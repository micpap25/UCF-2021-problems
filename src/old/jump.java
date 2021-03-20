package old;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;

public class jump {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        int trips = Integer.parseInt(br.readLine());

        for (int i = 0; i < trips; i++) {
            pw.println("Trip #" + (i + 1) + ":");
            String[] vals = br.readLine().split(" ");
            int x = Integer.parseInt(vals[0]);
            int y = Integer.parseInt(vals[1]);
            int n = Integer.parseInt(vals[2]);
            int ups = 0;
            int downs = 0;
            int lefts = 0;
            int rights = 0;
            for (int j = 0; j < n; j++){
                String direction = br.readLine();
                if (direction.equals("F")) {
                    if (y == 1) {}
                    else if (downs > 0) {
                        downs--;
                    }
                    else {
                        y--;
                    }
                    ups++;
                }
                else if (direction.equals("B")) {
                    if (y == 1) {}
                    else if (ups > 0) {
                        ups--;
                    }
                    else {
                        y--;
                    }
                    downs++;
                }
                else if (direction.equals("L")) {
                    if (x == 1) {}
                    else if (rights > 0) {
                        rights--;
                    }
                    else {
                        x--;
                    }
                    lefts++;
                }
                else if (direction.equals("R")) {
                    if (x == 1) {}
                    else if (lefts > 0) {
                        lefts--;
                    }
                    else {
                        x--;
                    }
                    rights++;
                }
                if (x < 1) x = 1;
                if (y < 1) y = 1;
                pw.println(x * y);
            }
            pw.println();
        }
        br.close();
        pw.close();
    }
}
