package Login;

import javax.swing.*;
import java.awt.*;

public class LoginUI {
    public static void main(String[] args) {
        JFrame loginframe = new JFrame("JAVASTOCK");
        loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginframe.setSize(450, 600);
        loginframe.setLocationRelativeTo(null);
        loginframe.setResizable(false);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BorderLayout(20, 20));
        loginPanel.setBackground(Color.LIGHT_GRAY);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(loginPanel.getBackground());
        titlePanel.add(Box.createVerticalStrut(50));
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("JAVASTOCK");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlePanel.add(titleLabel);

        JLabel subtitleLabel = new JLabel("Inventory Management System");
        subtitleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlePanel.add(subtitleLabel);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(loginPanel.getBackground());
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(loginPanel.getBackground());

        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(loginPanel.getBackground());
        inputPanel.setLayout(new GridLayout(7, 1, 0, 0));


        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameLabel.setForeground(Color.BLACK);

        JTextField usernameField = new JTextField();
        usernameField.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordLabel.setForeground(Color.BLACK);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 14));
        loginButton.setBackground(new Color(150,200,230));
        loginButton.setForeground(Color.BLACK);
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 14));
        exitButton.setBackground(new Color(255,105,97));
        exitButton.setForeground(Color.BLACK);


        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        inputPanel.add(new JLabel(""));
        inputPanel.add(loginButton);
        inputPanel.add(exitButton);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.LIGHT_GRAY);
        JLabel bottomLabel = new JLabel("Powered by EKRR Software Solutions");
        bottomLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        bottomLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        bottomPanel.add(Box.createVerticalStrut(50));
        bottomPanel.add(bottomLabel);

        loginPanel.add(leftPanel, BorderLayout.WEST);
        loginPanel.add(rightPanel, BorderLayout.EAST);
        loginPanel.add(titlePanel, BorderLayout.NORTH);
        loginPanel.add(inputPanel, BorderLayout.CENTER);
        loginPanel.add(bottomPanel,BorderLayout.SOUTH);


        loginframe.add(loginPanel);
        loginframe.setVisible(true);
    }
}
