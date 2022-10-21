package main;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("24H Clock");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(300,200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        panel.setLayout(null);
        panel.add(label);
        label.setFont(new Font("Arial", Font.BOLD, 48));
        label.setBounds(50,50,200,50);
        frame.setVisible(true);

        while (true) {

            LocalTime time = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = time.format(formatter);

            label.setText(formattedTime);
        }
    }
}