import java.io.*;

public class worse{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int num_words= Integer.parseInt(br.readLine());
        for (int i=0; i<num_words;i++){
            String[] values = br.readLine().split(" ");
            String s="";
            for (String val : values) {
                int adder=val.length()-1;
                char character= (char)(Character.getNumericValue('A')+ adder);
                String add=Character.toString(character);
                s+=add;

            }
            pw.println(s);
        }
        
    }
}
