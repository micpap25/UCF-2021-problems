import java.io.*;

public class melon{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        br.readLine();
        String str;
        while ((str = br.readLine()) != null) {
            String[] values = str.split(" ");
            int val1 = Integer.parseInt(values[0]);
            int val2 = Integer.parseInt(values[1]);
            pw.println((val1 + val2) * 2);
        }
    }
}
