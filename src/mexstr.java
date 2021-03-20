import java.io.*;
import java.util.Arrays;
import java.util.List;
public class mexstr{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int strings=Integer.parseInt(br.readLine());
        
        for(int i=0;i<strings;i++){
            String letters=br.readLine();
            
            String ret="";
            String added="a";
            boolean done=false;
           
            while(!done){

                if(letters.contains(ret+added)){
                    if (added.equals("z")){
                        ret+="a";
                        added="a";
                        
                    }
                    else{
                        added = Character.toString(added.charAt(0)+1);
                    }

                }
                else{
                    ret+=added;
                    done=true;
                }
            }
            pw.println(ret);
            
        }
        

        }
    }

        

        
    


