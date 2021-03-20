import java.io.*;

public class charging{
    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        br.readLine();
        String str;
        while ((str = br.readLine()) != null) {
            int i = Integer.parseInt(str);
            pw.println(100 - i);
        }
    }
}
