package model;

public class Query {
    private int id;
    private String question;
    private String response;

    public Query() {}

    public Query(String question, String response) {
        this.question = question;
        this.response = response;
    }

    public Query(int id, String question, String response) {
        this.id = id;
        this.question = question;
        this.response = response;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }
}
