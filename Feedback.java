package model;

public class Feedback {
    private int id;
    private String message;

    public Feedback() {}

    public Feedback(String message) {
        this.message = message;
    }

    public Feedback(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
