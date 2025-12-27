
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Java_Swings {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,600);
		frame.setTitle("Add Info");
		
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1 = new JLabel();
		label1.setText("Name:");
		label1.setBounds(10,10,150,20);
		frame.add(label1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(60,10,180,25);
		frame.add(tf1);
		
		JLabel label2 = new JLabel();
		label2.setText("ID:");
		label2.setBounds(10,40,150,20);
		frame.add(label2);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(60,40,180,25);
		frame.add(tf2);
		
		JLabel label3 = new JLabel();
		label3.setText("Batch:");
		label3.setBounds(10,70,150,20);
		frame.add(label3);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(60,70,180,25);
		frame.add(tf3);
		
		JButton btn1 = new JButton();
		btn1.setText("Show Information");
		btn1.setBounds(140,120,180,25);
		frame.add(btn1);
		
		JLabel label11 = new JLabel();
		label11.setText("Name:");
		label11.setBounds(10,160,300,20);
		frame.add(label11);
		

		JLabel label12 = new JLabel();
		label12.setText("ID:");
		label12.setBounds(10,190,150,20);
		frame.add(label12);
		

		JLabel label13 = new JLabel();
		label13.setText("Batch:");
		label13.setBounds(10,220,300,20);
		frame.add(label13);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				label11.setText("Name: "+tf1.getText());
				label12.setText("ID: "+tf2.getText());
				label13.setText("Batch: "+tf3.getText());
				
			}
		});
		
		
		frame.setVisible(true);
		
	}

}
