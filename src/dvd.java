import java.io.*;

public class dvd{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        br.readLine();
        String str;
        while ((str = br.readLine()) != null) {
            String[] values = str.split(" ");
            int logoWidth = Integer.parseInt(values[0]);
            int logoHeight = Integer.parseInt(values[1]);
            int screenWidth = Integer.parseInt(values[2]);
            int screenHeight = Integer.parseInt(values[3]);
            int x = 0;
            int y = 0;
            int count = 0;
            int dx = 1;
            int dy = 1;
            while (true){
                if ((x == 0 && y == 0 && count > 0) ||
                        (x == 0 && y == screenHeight - logoHeight) ||
                        (x == screenWidth - logoWidth && y == 0) ||
                        (x == screenWidth - logoWidth && y == screenHeight - logoHeight)){
                    pw.println(count);
                    break;
                }
                x += dx;
                y += dy;
                if ((x == screenWidth - logoWidth && dx == 1) ||
                        (x == 0 && dx == -1)){
                    dx *= -1;
                }
                if ((y == screenHeight - logoHeight && dy == 1) ||
                        (y == 0 && dy == -1)){
                    dy *= -1;
                }
                count++;
            }
        }
    }
}
