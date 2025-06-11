package Final_Project.Alpha.Garbage;

import java.awt.*;
import java.awt.event.*;

public class BackgrounfColorApp extends Frame
{

    public BackgrounfColorApp() {
        setTitle("ABC Supermarket");
        setSize(500, 400);
        setLayout(null);
        setBackground(Color.WHITE);

        Label title = new Label("Welcome to ABC Supermarket");
        title.setBounds(120, 50, 300, 30);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        add(title);

        Label prompt = new Label("What will you do today?");
        prompt.setBounds(150, 90, 300, 30);
        add(prompt);

        String[] options = {
                "Process Sale",
                "Check Stock",
                "Change Stock",
                "Report Monthly/Weekly/Daily"
        };

        int y = 130;
        for (String option : options) {
            Label clickable = new Label(option);
            clickable.setBounds(160, y, 250, 30);
            clickable.setForeground(Color.BLUE);
            clickable.setCursor(new Cursor(Cursor.HAND_CURSOR));

            // Add click behavior
            clickable.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    // Simulate next page
                    Frame nextPage = new Frame(option);
                    nextPage.setSize(300, 200);
                    nextPage.setLayout(new FlowLayout());
                    nextPage.add(new Label("You chose: " + option));
                    nextPage.setVisible(true);

                    nextPage.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent we) {
                            nextPage.dispose();
                        }
                    });
                }
            });

            add(clickable);
            y += 40;
        }

        setVisible(true);

        // Close this frame properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new BackgrounfColorApp();
    }
}