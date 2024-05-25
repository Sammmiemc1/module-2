
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Age  {


    public static void main(String[] args) {


        JFrame appFrame = new JFrame("Age");

        appFrame.setSize(490, 300);
        appFrame.setLocation(100, 150);
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel Day = new JLabel("Day");
        Day.setBounds(10, 10, 200, 30);
        JTextField DayText = new JTextField();
        DayText.setBounds(85, 10, 200, 30);

        JLabel Month = new JLabel("Month");
        Month.setBounds(10, 50, 200, 30);
        JTextField MonthText = new JTextField();
        MonthText.setBounds(85, 50, 200, 30);

        JLabel Year = new JLabel("Year");
        Year.setBounds(10, 90, 200, 30);
        JTextField YearText = new JTextField();
        YearText.setBounds(85, 90, 200, 30);

        JLabel OutputLabel = new JLabel("Your current age is:");
        OutputLabel.setBounds(10, 220, 200, 30);
        JTextField OutputText = new JTextField();
        OutputText.setBounds(125, 220, 235, 30);

        DateFormat dateFormat = new SimpleDateFormat(("yyyy"));
        Date date = new Date();
        JLabel CurrentYear = new JLabel("Current Year: ");
        CurrentYear.setBounds(10, 135, 200, 30);

        JTextField DateText = new JTextField(dateFormat.format(date));
        DateText.setBounds(87, 135, 200, 30);

        appFrame.add(Day);
        appFrame.add(Month);
        appFrame.add(Year);
        appFrame.add(CurrentYear);
        appFrame.add(DayText);
        appFrame.add(YearText);
        appFrame.add(MonthText);
        appFrame.add(DateText);
        appFrame.add(OutputText);
        appFrame.add(OutputLabel);

        appFrame.setLayout(null);
        appFrame.setVisible(true);
        appFrame.setResizable(false);

        JButton appButton = new JButton("Your Age");
        appButton.setBounds(120, 170, 120, 30);
        appFrame.add(appButton);

        appButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int currentYear = Integer.parseInt(DateText.getText());
            	int birthYear = Integer.parseInt(YearText.getText());

            	int val = currentYear - birthYear;

            	OutputText.setText(String.valueOf(val));

            }
        });

    }


}