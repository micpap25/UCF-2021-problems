import java.io.*;
import java.util.Arrays;

public class triangles{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int num_shipments= Integer.parseInt(br.readLine());
        for (int i=0;i<num_shipments;i++){
            String[] values = br.readLine().split(" ");
            int num_sticks=Integer.parseInt(values[0]);
            
            int num_acute=0;
            int num_right=0;
            int num_obtuse=0;
            for(int j=1; j<num_sticks;j++){
                
            }
            pw.println(num_acute+" "+num_right+" "+num_obtuse);

        }
        
       
    }
}
