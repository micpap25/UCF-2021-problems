import java.io.*;

public class nomor{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        br.readLine();
        String str;
        while ((str = br.readLine()) != null) {
            String ret = "";
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) != 'e'){
                    ret += str.substring(i, i+1);
                }
            }
            pw.println(ret);
        }
    }
}
