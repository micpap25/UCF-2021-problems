import java.io.*;

public class mexstr{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int strings=Integer.parseInt(br.readLine());
        
        for(int i=0;i<strings;i++){
            String [] letters=br.readLine().split("");
            String ret="";
            String added="a";
            for (String letter : letters) {
            
            if (letter.equals("z")){
                ret+="a";
            }
            else{
                ret+= Character.toString((char)(letter.charAt(0)-1));
                break;
            }
            
        }
        pw.println(ret);

        }

        }

        
    }


