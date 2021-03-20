import java.io.*;
import java.util.Arrays;

public class triangles{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int num_shipments= Integer.parseInt(br.readLine());
        for (int i=0;i<num_shipments;i++){
            String[] values = br.readLine().split(" ");
            int num = Integer.parseInt(values[0]);
            

            int[] sticks = new int[num];
            for(int j=1; j<num;j++){
                sticks[j - 1] = Integer.parseInt(values[i]);
            }
            int acute=calculateAcute();
            int right=calculateRight();
            int obtuse=calculateObtuse();
            pw.println(acute + " " + right + " " + obtuse);

        }
        
       
    }

    private static int calculateObtuse() {
        return 1;
    }

    private static int calculateRight() {
        return 1;
    }

    private static int calculateAcute() {
        return 1;
    }
}
