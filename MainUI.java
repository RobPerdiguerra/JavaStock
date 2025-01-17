import javax.swing.*;
import java.awt.*;

public class MainUI {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("JAVASTOCK");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1280, 720);
        mainFrame.setLocationRelativeTo(null);

        JPanel placeholderPanel = new JPanel();
        placeholderPanel.setBackground(Color.WHITE);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(20, 20));
        mainPanel.setBackground(Color.LIGHT_GRAY);

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.WHITE);
        menuPanel.setPreferredSize(new Dimension(200, mainFrame.getHeight()));
        menuPanel.setLayout(new GridLayout(10, 1, 0, 0));
        menuPanel.add(Box.createVerticalStrut(10));

        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(menuPanel.getBackground());
        menuPanel.add(logoPanel);

        JLabel logoLabel = new JLabel("JAVASTOCK");
        logoLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        logoPanel.add(logoLabel);
        JLabel sublogoLabel = new JLabel("Inventory Management System");
        sublogoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        logoPanel.add(sublogoLabel);
        

        JButton dashboardButton = new JButton("Dashboard");
        dashboardButton.setFont(new Font("Arial", Font.PLAIN, 14));
        dashboardButton.setBackground(new Color(150,200,230));
        dashboardButton.setForeground(Color.BLACK);
        menuPanel.add(dashboardButton);

        JButton inventoryButton = new JButton("Inventory");
        inventoryButton.setFont(new Font("Arial", Font.PLAIN, 14));
        inventoryButton.setBackground(new Color(150,200,230));
        inventoryButton.setForeground(Color.BLACK);
        menuPanel.add(inventoryButton);

        JButton supplierButton = new JButton("Suppliers");
        supplierButton.setFont(new Font("Arial", Font.PLAIN, 14));
        supplierButton.setBackground(new Color(150,200,230));
        supplierButton.setForeground(Color.BLACK);
        menuPanel.add(supplierButton);

        menuPanel.add(placeholderPanel);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setFont(new Font("Arial", Font.PLAIN, 14));
        logoutButton.setBackground(new Color(150,200,230));
        logoutButton.setForeground(Color.BLACK);
        menuPanel.add(logoutButton);

        mainPanel.add(menuPanel);


        mainFrame.add(mainPanel, BorderLayout.WEST);
        mainFrame.setVisible(true);
    }
}
