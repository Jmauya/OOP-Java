import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setTitle("Add Info");

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel();
        label1.setText("1st Number:");
        label1.setBounds(10, 10, 100, 20);
        frame.add(label1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 10, 100, 25);
        frame.add(tf1);

        JLabel label2 = new JLabel();
        label2.setText("2nd Number:");
        label2.setBounds(10, 40, 100, 20);
        frame.add(label2);

        JTextField tf2 = new JTextField();
        tf2.setBounds(100, 40, 100, 25);
        frame.add(tf2);


        JButton btn1 = new JButton();
        btn1.setText("Add(+)");
        btn1.setBounds(10, 120, 80, 25);
        frame.add(btn1);

        JLabel label11 = new JLabel();
        label11.setBounds(10, 190, 200, 25);
        frame.add(label11);
        
        JButton btn2 = new JButton();
        btn2.setText("Minus(-)");
        btn2.setBounds(100, 120, 100, 25);
        frame.add(btn2);

        
        JButton btn3 = new JButton();
        btn3.setText("Multiply(*)");
        btn3.setBounds(210, 120, 100, 25);
        frame.add(btn3);
        
   
        JButton btn4 = new JButton();
        btn4.setText("Divide(/)");
        btn4.setBounds(320, 120, 100, 25);
        frame.add(btn4);
        
    
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a = Integer.parseInt(tf1.getText());
               int b = Integer.parseInt(tf2.getText());
               
               label11.setText("Result: "+(a+b));
               
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a = Integer.parseInt(tf1.getText());
               int b = Integer.parseInt(tf2.getText());
               
               label11.setText("Result: "+(a-b));
               
            }
        });
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a = Integer.parseInt(tf1.getText());
               int b = Integer.parseInt(tf2.getText());
               
               label11.setText("Result: "+(a*b));
               
            }
        });
        
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a = Integer.parseInt(tf1.getText());
               int b = Integer.parseInt(tf2.getText());
               
               label11.setText("Result: "+(a/b));
               
            }
        });


        frame.setVisible(true);
    }
}
