package src.practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogsLatency {

    static class LogsEntry{
        String id;
        String timeStamp;
        String status;

        public LogsEntry(String id, String timeStamp, String status){
            this.id = id;
            this.timeStamp = timeStamp;
            this.status = status;
        }

        // Getter and Setter for id
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        // Getter and Setter for timestamp
        public String getTimestamp() {
            return timeStamp;
        }

        public void setTimestamp(String timestamp) {
            this.timeStamp = timestamp;
        }

        // Getter and Setter for status
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }

    public static void main(String[] args) {
        List<LogsEntry> logs = new ArrayList<>();

        logs.add(new LogsEntry("1","0002","PASS"));
        logs.add(new LogsEntry("2","0004","PASS"));
        logs.add(new LogsEntry("3","0008","FAIL"));
        logs.add(new LogsEntry("4","0003","PASS"));
        logs.add(new LogsEntry("5","0004","PASS"));

        detectLatency(logs);
        
    }

    private static void detectLatency(List<LogsEntry> logs) {
        for(LogsEntry logsEntry: logs){
            if(Long.valueOf(logsEntry.timeStamp) > 0005){
                System.out.println(logsEntry.getId() + " " + logsEntry.getStatus());
            }
        }
    }
}
