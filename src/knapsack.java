import java.io.*;
public class knapsack{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int num_raids= Integer.parseInt(br.readLine());
        String str;
        int inventory=0;
        for(int i=0; i<num_raids;i++){
            String[] stats = br.readLine().split(" ");
            int lootitems = Integer.parseInt(stats[0]);
            int capacity = Integer.parseInt(stats[1]);
            
            for(int j=0; j<lootitems;j++){
                String[] items = br.readLine().split(" ");
                int value = Integer.parseInt(items[0]);
                int weight = Integer.parseInt(items[1]);
            }
       }
    }
}