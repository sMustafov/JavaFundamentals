package Problem4;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, LinkedHashMap<String, Integer>> userLogs = new TreeMap<>();
        String[] input = sc.nextLine().split(" ");
        while (!input[0].equals("end")) {
            String IP = input[0].replace("IP=", " ").trim();
            String message = input[1].replace("message=", " ").trim();
            String user = input[2].replace("user=", " ").trim();

            if (!userLogs.containsKey(user)) {
                userLogs.put(user, new LinkedHashMap<>());
                userLogs.get(user).put(IP, 1);
            } else {
                if (!userLogs.get(user).containsKey(IP)) {
                    userLogs.get(user).put(IP, 1);
                } else {
                    int counter = userLogs.get(user).get(IP);
                    userLogs.get(user).put(IP, ++counter);
                }
            }
            input = sc.nextLine().split(" ");
        }

        for (String user : userLogs.keySet()) {
            System.out.println(user + ":");
            String ipOutput = "";
            for (String ip : userLogs.get(user).keySet()) {
                ipOutput += String.format("%s => %d, ", ip, userLogs.get(user).get(ip));
            }
            ipOutput = ipOutput.substring(0, ipOutput.length() - 2) + '.';
            System.out.println(ipOutput);
        }
    }
}
