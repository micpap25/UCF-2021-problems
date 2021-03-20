package old;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;

public class burrito {
    public static void main(String[]args) throws Exception{
        final double PI = 3.141592653589793;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        int burritos = Integer.parseInt(br.readLine());

        for (int i = 0; i < burritos; i++) {
            pw.print("Burrito #" + (i + 1) + ": ");
            String[] burritoVals = br.readLine().split(" ");
            double volume = Integer.parseInt(burritoVals[0]);
            double radius = Integer.parseInt(burritoVals[1]);
            String[] foilVals = br.readLine().split(" ");
            double width = Integer.parseInt(foilVals[0]);
            double length = Integer.parseInt(foilVals[1]);
            double burritoLength = volume / (radius * radius * PI);

            boolean alignedWithLength = false;

            boolean lengthFits = length  > burritoLength + 2 * radius;
            boolean widthFits = width > burritoLength + 2 * radius;;

            if (!lengthFits && !widthFits) {
                pw.println("Looks like a cold old.burrito today.");
                continue;
            }

            else if (lengthFits && !widthFits) {
                alignedWithLength = true;
            }

            else if (lengthFits){
                if (width > length) {
                    alignedWithLength = true;
                }
            }

            if (alignedWithLength) {
                if (width > 2 * PI * radius) {
                     pw.println("Don’t worry, the old.burrito fits!");
                } else {
                    pw.println("Looks like a cold old.burrito today.");
                }
            } else {
                if (length > 2 * PI * radius) {
                    pw.println("Don’t worry, the old.burrito fits!");
                } else {
                    pw.println("Looks like a cold old.burrito today.");
                }
            }
        }
        br.close();
        pw.close();
    }
}
