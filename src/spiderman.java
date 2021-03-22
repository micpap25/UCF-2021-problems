import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class spiderman{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int heists = Integer.parseInt(br.readLine());
        for (int i = 0; i < heists; i++) {
            String[] values = br.readLine().split(" ");
            int inters = Integer.parseInt(values[0]);
            int roads = Integer.parseInt(values[1]);
            HashMap<Integer, ArrayList<Integer>> connections = new HashMap<>();
            for (int j = 0; j < roads; j++) {
                String[] roadVals = br.readLine().split(" ");
                int i1 = Integer.parseInt(roadVals[0]);
                int i2 = Integer.parseInt(roadVals[1]);

                if (connections.containsKey(i1)) {
                    ArrayList<Integer> list = connections.get(i1);
                    list.add(i2);
                    connections.put(i1, list);
                } else {
                    connections.put(i1, new ArrayList<>(Collections.singletonList(i2)));
                }

                if (connections.containsKey(i2)) {
                    ArrayList<Integer> list = connections.get(i2);
                    list.add(i1);
                    connections.put(i2, list);
                } else {
                    connections.put(i2, new ArrayList<>(Collections.singletonList(i1)));
                }
            }
            if (checkArea(inters, connections, new ArrayList<>())) {
                pw.println("Halt, Spider-Man! Plans Thwarted!");
            } else {
                pw.println("How Sad, Perpetrator Triumphed.");
            }
        }
    }
    private static boolean checkArea(int inters, HashMap<Integer, ArrayList<Integer>> connections, ArrayList<Integer> checkedAreas) {
        if (checkedAreas.contains(inters)) return false;
        ArrayList<Integer> roads = connections.get(inters);
        if (roads.size() == 1){
            return true;
        } else {
            boolean allBlocked = true;
            ArrayList<Integer> newCheckedAreas = new ArrayList<>(checkedAreas);
            newCheckedAreas.add(inters);
            for (int i : roads){
                if (!checkArea(i, connections, newCheckedAreas)){
                    allBlocked = false;
                    break;
                }
            }
            return allBlocked;
        }
    }
}
