package old;

import java.io.*;


public class knights {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        String target = "";

        br.readLine();

        String number;
        while ((number = br.readLine()) != null) {

            if (number.contains("1")) {

                target = "old.knights ";
            }
            if (number.contains("5") || number.contains("6") || number.contains("7") || number.contains("8") || number.contains("9")) {
                target += "pirates ";
            }
            if (number.contains("0")) {
                target += "ninjas ";
            }

            pw.println(number + " " + target);
            target = "";
        }

    }
}