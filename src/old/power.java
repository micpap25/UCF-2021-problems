package old;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;

public class power {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        br.readLine();

        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            pw.println(Math.pow(2, n) - 1);
        }
        br.close();
        pw.close();
    }
}
