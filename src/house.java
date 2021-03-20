import java.io.*;

public class house{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int numhouses= Integer.parseInt(br.readLine());
        for (int i=0; i<numhouses;i++){
            pw.println(5*Integer.parseInt(br.readLine()));
        }
        
    }
}
