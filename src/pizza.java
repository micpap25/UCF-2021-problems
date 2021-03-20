import java.io.*;
import java.util.ArrayList;

public class pizza{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int days = Integer.parseInt(br.readLine());
        for (int i = 0; i < days; i++){
            String[] values = br.readLine().split(" ");
            int people = Integer.parseInt(values[0]);
            int toppings = Integer.parseInt(values[1]);
            int money = Integer.parseInt(values[2]);
            ArrayList<Person> peopleList = new ArrayList<>();
            for (int j = 0; j < people; j++) {
                String[] personVals = br.readLine().split(" ");
                int numToppings = Integer.parseInt(personVals[1]);
                int[] toppingList = new int[numToppings];
                for (int k = 1; k <= numToppings; k++) {
                    toppingList[k - 1] = Integer.parseInt(personVals[k]);
                }
                peopleList.add(new Person(toppingList));
            }

        }
    }

    private static class Person {
        public int[] toppings;
        Person(int[] toppings) {
            this.toppings = toppings;
        }

    }
}
