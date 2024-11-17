package src.leetcode;

import java.util.*;

public class AudibleGroups {

    public static int countGroups(List<String> related) {
        int n = related.size();
        boolean[] visited = new boolean[n];
        int groupCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(related, visited, i, n);
                groupCount++;
            }
        }

        return groupCount;
    }

    private static void dfs(List<String> related, boolean[] visited, int person, int n) {
        visited[person] = true;

        // Traverse all persons and find those who are related to the current person
        for (int otherPerson = 0; otherPerson < n; otherPerson++) {
            if (related.get(person).charAt(otherPerson) == '1' && !visited[otherPerson]) {
                dfs(related, visited, otherPerson, n);
            }
        }
    }

    public static void main(String[] args) {
        List<String> related = Arrays.asList(
            "1100",
            "1110",
            "0110",
            "0001"
        );
        
        System.out.println(countGroups(related)); // Expected output: 2
    }
}
