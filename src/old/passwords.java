package old;

import java.io.*;

public class passwords{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        br.readLine();
        String str;
        while ((str = br.readLine()) != null) {
            String uppers = "";
            String lowers = "";
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    uppers += str.substring(i, i+1);
                } else {
                    lowers += str.substring(i, i+1);
                }
            }
            pw.println(uppers + lowers);
        }
    }
}
