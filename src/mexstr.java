import java.io.*;
import java.util.Arrays;
import java.util.List;
public class mexstr{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int strings=Integer.parseInt(br.readLine());
        for(int i=0;i<strings;i++){
            boolean done = false;
            String str = br.readLine();
            for (char c = 'a'; c < 'z'; c++){
                if (!str.contains(String.valueOf(c))){
                    pw.println(c);
                    done = true;
                    break;
                }
            }
            if (done) continue;
            for (char c = 'a'; c < 'z'; c++){
                for (char d = 'a'; d < 'z'; d++) {
                    String two = String.valueOf(c) + d;
                    if (!str.contains(two)) {
                        pw.println(two);
                        done = true;
                        break;
                    }
                }
                if (done) break;
            }
            if (done) continue;
            for (char c = 'a'; c < 'z'; c++){
                for (char d = 'a'; d < 'z'; d++) {
                    for (char e = 'a'; e < 'z'; e++) {
                        String two = String.valueOf(c) + d + e;
                        if (!str.contains(two)) {
                            pw.println(two);
                            done = true;
                            break;
                        }
                    }
                    if (done) break;
                }
                if (done) break;
            }
        }
    }
}

        

        
    


