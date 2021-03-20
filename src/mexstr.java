import java.io.*;

public class mexstr{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        br.readLine();
        String str;
        while((str = br.readLine()) != null){
            String [] letters=str.split("");
        String ret="";
        for (String letter : letters) {
            if (letter.equals("a")){
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


