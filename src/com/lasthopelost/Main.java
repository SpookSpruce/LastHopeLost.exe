package com.lasthopelost;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        JFrame frame = new JFrame("LastHopeLost v1.0.0 PUBLIC-RELEASE");
        frame.setLayout(null);
        frame.setSize(520, 500);

        ImageIcon starticon = new ImageIcon(Main.class.getResource("/resources/start.png"));
        Image scaled = starticon.getImage().getScaledInstance(100, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaled);
        JButton button = new JButton(scaledIcon);
        button.setToolTipText("Start malware");
        button.setBounds(200, 350, 100, 50);
        button.setFocusable(false);

        JLabel title = new JLabel("LastHopeLost Malware v1.0.0");
        title.setBounds(5, 5, 500, 20);
        title.setFont(new Font("Arial", Font.PLAIN, 24));

        JLabel paragraph = new JLabel("<html>Welcome to version 1.0.0 of LastHopeLost!<br>This is a virus that I made!<br>Run at your own risk, I made this for educational purposes not for execution."
                + "<br>This was made for cybersecurity and kernel learning not anything intentional<br>"
                + "<br>WARNING: OWNER IS NOT LIABLE FOR DAMAGES, THIS IS A WARNING. ONLY TEST ON VIRTUAL MACHINES.</html>");
        paragraph.setBounds(10, 40, 500, 125);
        paragraph.setFont(new Font("Arial", Font.PLAIN, 14));

        button.addActionListener(e -> {
            Gui.showFirstPopup(frame);
        });

        frame.add(title);
        frame.add(button);
        frame.add(paragraph);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
