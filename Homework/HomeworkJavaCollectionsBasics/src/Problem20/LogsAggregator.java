package Problem20;

import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, Integer> logsAggregator = new TreeMap<>();
        HashMap<String, TreeSet<String>> logIp = new HashMap<>();

        for (int i = 0; i < n; i++){
            String[] input = scan.nextLine().split(" ");
            String user = input[1];
            String ip = input[0];
            Integer duration = Integer.parseInt(input[2]);

            Integer result = logsAggregator.get(user);
            if (result == null) {
                result = 0;
            }

            logsAggregator.put(user, result + duration);

            TreeSet<String> resIp = logIp.get(user);
            if (resIp == null) {
                resIp = new TreeSet<>();
            }
            resIp.add(ip);
            logIp.put(user, resIp);
        }

        for (Map.Entry<String,Integer> entry : logsAggregator.entrySet()){
                System.out.printf("%s: %d " + logIp.get(entry.getKey()) + "\n", entry.getKey(), entry.getValue());
        }
    }
}
