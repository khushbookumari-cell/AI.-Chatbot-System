package com.chatbot;

import java.util.Scanner;

public class Chatbot {

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Java Chatbot!");
        System.out.print("You: ");
        String input = sc.nextLine();
        System.out.println("Bot: You said -> " + input);
    }
}
