package Final_Project.Alpha.Garbage;
import java.awt.*;
import java.awt.event.*;

public class BackgroundColorApp {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Calculator");

        // Set frame size and background
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setBackground(Color.LIGHT_GRAY);

        // Input fields
        TextField tf1 = new TextField();
        tf1.setBounds(50, 50, 130, 30);

        TextField tf2 = new TextField();
        tf2.setBounds(220, 50, 130, 30);

        // Result label
        Label resultLabel = new Label("Result: ");
        resultLabel.setBounds(50, 100, 300, 30);

        // Buttons
        Button addBtn = new Button("+");
        addBtn.setBounds(50, 150, 50, 30);

        Button subBtn = new Button("-");
        subBtn.setBounds(120, 150, 50, 30);

        Button mulBtn = new Button("*");
        mulBtn.setBounds(190, 150, 50, 30);

        Button divBtn = new Button("/");
        divBtn.setBounds(260, 150, 50, 30);

        // Action listeners
        ActionListener calcListener = e -> {
            try {
                double num1 = Double.parseDouble(tf1.getText());
                double num2 = Double.parseDouble(tf2.getText());
                double result = 0;

                if (e.getSource() == addBtn) result = num1 + num2;
                else if (e.getSource() == subBtn) result = num1 - num2;
                else if (e.getSource() == mulBtn) result = num1 * num2;
                else if (e.getSource() == divBtn) {
                    if (num2 != 0) result = num1 / num2;
                    else {
                        resultLabel.setText("Result: Cannot divide by zero");
                        return;
                    }
                }

                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
        };

        addBtn.addActionListener(calcListener);
        subBtn.addActionListener(calcListener);
        mulBtn.addActionListener(calcListener);
        divBtn.addActionListener(calcListener);

        // Add components to frame
        frame.add(tf1);
        frame.add(tf2);
        frame.add(resultLabel);
        frame.add(addBtn);
        frame.add(subBtn);
        frame.add(mulBtn);
        frame.add(divBtn);

        frame.setVisible(true);

        // Window close
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
