package src.leetcode;

import java.util.*;

public class LogsThreshold {
    public static List<String> processLogs(List<String> logs, int threshold) {
        Map<String, Integer> transactionCount = new HashMap<>();

        for (String log : logs) {
            String[] parts = log.split(" ");
            String sender = parts[0];
            String recipient = parts[1];

            // Increment transaction count for sender
            transactionCount.put(sender, transactionCount.getOrDefault(sender, 0) + 1);

            // Increment transaction count for recipient if different from sender
            if (!sender.equals(recipient)) {
                transactionCount.put(recipient, transactionCount.getOrDefault(recipient, 0) + 1);
            }
        }

        // Collect users with transactions over the threshold
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : transactionCount.entrySet()) {
            if (entry.getValue() >= threshold) {
                result.add(entry.getKey());
            }
        }

        // Sort the result in ascending numeric order
        Collections.sort(result, Comparator.comparingInt(Integer::parseInt));

        return result;
    }

    public static void main(String[] args) {
        List<String> logs = Arrays.asList("1 2 50", "1 7 70", "1 3 20", "2 2 17");
        int threshold = 2;
        System.out.println(processLogs(logs, threshold)); // Expected output: [1, 2]
    }
}
