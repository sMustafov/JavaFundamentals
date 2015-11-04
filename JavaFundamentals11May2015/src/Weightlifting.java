import java.util.*;

public class Weightlifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        TreeMap<String, TreeMap<String,Long>> WeightLifting = new TreeMap<>();

        for (int i = 0; i < n; i++){
            String [] input = sc.nextLine().trim().split(" ");
            String name = input[0];
            String disciplin = input[1];
            long kg = Integer.parseInt(input[2]);
            long res = kg;

            if (!WeightLifting.containsKey(name)) {
                res = 0;
                res = kg;
                WeightLifting.put(name, new TreeMap<>());
                WeightLifting.get(name).put(disciplin, res);
            } else {
                if (!WeightLifting.get(name).containsKey(disciplin)) {
                    res = 0;
                    res = kg;
                    WeightLifting.get(name).put(disciplin, res);

                } else {
                    long counter = WeightLifting.get(name).get(disciplin);
                    WeightLifting.get(name).put(disciplin, res += counter);
                }
            }
        }

        for (String name : WeightLifting.keySet()) {
            System.out.print(name + " : ");
            String disciplin = "";
            for (String dis : WeightLifting.get(name).keySet()) {
                disciplin += String.format("%s - %d kg, ", dis, WeightLifting.get(name).get(dis));
            }
            disciplin = disciplin.substring(0, disciplin.length() - 2);
            System.out.println(disciplin);
        }
    }
}
