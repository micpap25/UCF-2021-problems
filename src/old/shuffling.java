package old;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class shuffling {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int sprees = Integer.parseInt(br.readLine());

        for (int i = 0; i < sprees; i++) {
            String[] vals = br.readLine().split(" ");
            int cards = Integer.parseInt(vals[0]);
            int days = Integer.parseInt(vals[1]);
            int[] permutation = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
        }
        br.close();
        pw.close();
    }
}
