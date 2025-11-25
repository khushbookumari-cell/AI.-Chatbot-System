package model;

import java.util.HashMap;
import java.util.Map;

public class ChatbotConfig {
    private Map<String, String> knowledgeBase = new HashMap<>();

    public ChatbotConfig() {
        // default responses
        knowledgeBase.put("hello", "Hi! How can I help you?");
        knowledgeBase.put("hi", "Hello! How can I help?");
        knowledgeBase.put("bye", "Goodbye! Have a nice day.");
    }

    public void addResponse(String question, String answer) {
        knowledgeBase.put(question.toLowerCase(), answer);
    }

    public String getResponse(String question) {
        if (question == null) return "Sorry, I don't understand.";
        String key = question.toLowerCase().trim();
        return knowledgeBase.getOrDefault(key, "Sorry, I don't understand. An admin can add this question to the knowledge base.");
    }

    public Map<String, String> getKnowledgeBase() {
        return knowledgeBase;
    }
}
