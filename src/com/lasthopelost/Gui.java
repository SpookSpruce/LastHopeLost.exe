package com.lasthopelost;

import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void showFirstPopup(JFrame frame) {
        JDialog popup = new JDialog(frame, "Warning", true);
        popup.setLayout(new BorderLayout());
        Execute.message();

        JLabel label = new JLabel("ARE YOU COMPLETELY SURE???", SwingConstants.CENTER);
        popup.add(label, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btn1 = new JButton("Yes!");
        JButton btn2 = new JButton("No, disable!");

        btn1.addActionListener(ev -> {
            popup.dispose();
            showSecondPopup(frame);
        });
        
        btn2.addActionListener(ev -> popup.dispose());
        
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);

        popup.add(buttonPanel, BorderLayout.SOUTH);
        popup.setSize(300, 150);
        popup.setLocationRelativeTo(frame);
        popup.setVisible(true);
    }

    public static void showSecondPopup(JFrame frame) {
        JDialog secondPopup = new JDialog(frame, "Confirmation", true);
        secondPopup.setLayout(new BorderLayout());

        JLabel secondLabel = new JLabel("You clicked YES! Are you COMPLETELY sure about this? This is the last warning.", SwingConstants.CENTER);
        secondPopup.add(secondLabel, BorderLayout.CENTER);

        JPanel secondButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton secondBtn1 = new JButton("Absolutely!");
        JButton secondBtn2 = new JButton("No, Disable Virus");

        secondBtn1.addActionListener(ev -> {
            secondPopup.dispose();
        });
        secondBtn2.addActionListener(ev -> {
            secondPopup.dispose();
        });

        secondButtonPanel.add(secondBtn1);
        secondButtonPanel.add(secondBtn2);

        secondPopup.add(secondButtonPanel, BorderLayout.SOUTH);
        secondPopup.setSize(550, 150);
        secondPopup.setLocationRelativeTo(frame);
        secondPopup.setVisible(true);
    }
}
