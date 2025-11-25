package model;

import java.time.LocalDateTime;

public class InteractionLog {
    private int id;
    private String userQuery;
    private String botResponse;
    private LocalDateTime logTime;

    public InteractionLog() {}

    public InteractionLog(String userQuery, String botResponse) {
        this.userQuery = userQuery;
        this.botResponse = botResponse;
        this.logTime = LocalDateTime.now();
    }

    public InteractionLog(int id, String userQuery, String botResponse, LocalDateTime logTime) {
        this.id = id;
        this.userQuery = userQuery;
        this.botResponse = botResponse;
        this.logTime = logTime;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUserQuery() { return userQuery; }
    public void setUserQuery(String userQuery) { this.userQuery = userQuery; }

    public String getBotResponse() { return botResponse; }
    public void setBotResponse(String botResponse) { this.botResponse = botResponse; }

    public LocalDateTime getLogTime() { return logTime; }
    public void setLogTime(LocalDateTime logTime) { this.logTime = logTime; }
}
