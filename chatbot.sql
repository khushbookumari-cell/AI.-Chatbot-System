-- Database schema for AI Chatbot System
CREATE DATABASE IF NOT EXISTS chatbotdb;
USE chatbotdb;

CREATE TABLE IF NOT EXISTS queries (
    id INT PRIMARY KEY AUTO_INCREMENT,
    question VARCHAR(255),
    answer VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS feedback (
    id INT PRIMARY KEY AUTO_INCREMENT,
    message VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS interaction_logs (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_query TEXT,
    bot_response TEXT,
    log_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
