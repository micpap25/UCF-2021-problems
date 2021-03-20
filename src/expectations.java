import java.io.*;

public class expectations{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        
        
        int numlines= Integer.parseInt(br.readLine());
        String str;
        for ( int j=0;j<numlines;j++) {
            str = br.readLine();
            String[] vals = str.split(" ");
            int curScore = Integer.parseInt(vals[1]);
            int makeUpPoints = 0;
            for (int i = 2; i < vals.length; i++){
                int score = Integer.parseInt(vals[i]);
                if (score <= curScore){
                    makeUpPoints += curScore - score + 1;
                    curScore = curScore + 1;
                } else {
                    curScore = score;
                }
            }
            pw.println(makeUpPoints);
        }
    }
}
