import ui.AdminDashboard;
import ui.UserDashboard;
import model.ChatbotConfig;
import service.ChatbotService;
import service.AdminService;
import service.DataAnalysisService;
import service.AlgorithmService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ChatbotConfig config = new ChatbotConfig();

        ChatbotService chatbotService = new ChatbotService(config);
        AdminService adminService = new AdminService(config);
        DataAnalysisService analysisService = new DataAnalysisService();
        AlgorithmService algoService = new AlgorithmService();

        UserDashboard userUI = new UserDashboard();
        AdminDashboard adminUI = new AdminDashboard();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- AI Chatbot System -----");
            System.out.println("1. User");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            String line = sc.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    userUI.start(chatbotService);
                    break;

                case 2:
                    adminUI.start(adminService, analysisService, algoService, chatbotService);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
