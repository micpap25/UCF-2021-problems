package old;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;

public class shift {
    public static void main(String[]args) throws Exception{
        final String shiftCharacter = "QWERTYUIOPASDFGHJKLZXCVBNM~!@#$%^&*()_+{}|:\"<>?";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        int lines = Integer.parseInt(br.readLine());

        for (int k = 0; k < lines; k++){
            String str = br.readLine();
            boolean capSection = false;
            int count = 0;
            for (int i = 0; i < str.length(); i++){
                String character = str.substring(i, i+1);
                if (shiftCharacter.contains(character)){
                    if (!capSection) {
                        capSection = true;
                        count++;
                    }
                } else {
                    capSection = false;
                }
            }
            pw.println("The old.shift key was pressed " + count + " times.");
        }
        br.close();
        pw.close();
    }
}
