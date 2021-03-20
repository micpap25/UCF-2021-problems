import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

import static java.util.Comparator.comparing;

public class blob{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int games = Integer.parseInt(br.readLine());
        for (int i = 0; i < games; i++){
            String[] values = br.readLine().split(" ");
            int students = Integer.parseInt(values[0]);
            int tags = Integer.parseInt(values[1]);
            int[] bumps = new int[students];
            ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
            for (int k = 1; k <= students; k++){
                groups.add(new ArrayList<>(Collections.singletonList(k)));
            }
            for (int j = 0; j < tags; j++){
                String[] tagValues = br.readLine().split(" ");
                int s1 = Integer.parseInt(tagValues[0]);
                int s2 = Integer.parseInt(tagValues[1]);
                ArrayList<Integer> group1 = new ArrayList<>();
                ArrayList<Integer> group2 = new ArrayList<>();
                for (ArrayList<Integer> g : groups){
                    if (g.contains(s1)) group1 = new ArrayList<>(g);
                    if (g.contains(s2)) group2 = new ArrayList<>(g);
                    if (group1.size() != 0 && group2.size() != 0 ) break;
                }
                if (bumps[s1 - 1] == 2 || bumps[s2 - 1] == 2) {
                    continue;
                }
                bumps[s1 - 1]++;
                bumps[s2 - 1]++;
                if (group1.equals(group2)) {
                    continue;
                }
                groups.remove(group1);
                groups.remove(group2);
                group1.addAll(group2);
                groups.add(group1);
            }
            pw.println(Collections.max(groups, Comparator.comparing(ArrayList::size)).size());
        }
    }
}
