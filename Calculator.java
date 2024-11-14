package temp;

//import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JPanel;
//import javax.swing.JFrame;
//import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JTextField t1;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	JButton b14;
	JButton b15;
	JButton b16;
	
	int n = 0,i = 0;
	
	Calculator() {
		
		//Frame Properties
		
		
		//Text Field Properties
		t1 = new JTextField();
//		t1.setBackground(Color.CYAN);
		t1.setBounds(100, 100, 300, 40);
		
		//Initializing Button objects
		b1 = new JButton ("1");
		b2 = new JButton ("2");
		b3 = new JButton ("3");
		b4 = new JButton ("4");
		b5 = new JButton ("5"); 	
		b6 = new JButton ("6");	
		b7 = new JButton ("7");	
		b8 = new JButton ("8");
		b9 = new JButton ("9");
		b10 = new JButton ("0");
		b11 = new JButton ("+");
		b12 = new JButton ("-");
		b13 = new JButton ("*");
		b14 = new JButton ("/");
		b15 = new JButton ("AC");
		b16 = new JButton ("=");	
		
		//Setting size of buttons
		b1.setBounds(100, 140, 50, 30);
		b2.setBounds(150, 140, 50, 30);
		b3.setBounds(200, 140, 50, 30);	
		b4.setBounds(250, 140, 50, 30);	
		b5.setBounds(100, 170, 50, 30);	 	
		b6.setBounds(150, 170, 50, 30);		
		b7.setBounds(200, 170, 50, 30);			
		b8.setBounds(250, 170, 50, 30);
		b9.setBounds(100, 200, 50, 30);	
		b10.setBounds(150, 200, 50, 30);	
		b11.setBounds(200, 200, 50, 30);	
		b12.setBounds(250, 200, 50, 30);	
		b13.setBounds(100, 230, 50, 30);	
		b14.setBounds(150, 230, 50, 30);	
		b15.setBounds(200, 230, 50, 30);	
		b16.setBounds(250, 230, 50, 30);
		
		//Setting ActionListener to buttons
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		
		//Panel
		JPanel pan = new JPanel();
		
		pan.add(t1);
		pan.add(b1);pan.add(b2);pan.add(b3);pan.add(b4);
		pan.add(b5);pan.add(b6);pan.add(b7);pan.add(b8);
		pan.add(b9);pan.add(b10);pan.add(b11);pan.add(b12);
		pan.add(b13);pan.add(b14);pan.add(b15);pan.add(b16);
		
		JFrame fra = new JFrame("Calculator");
		fra.setSize(400,500);
		fra.setLayout(null);
		fra.setVisible(true);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fra.setContentPane(pan);
		
	}
	
	public static void main(String[] argd) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			t1.setText(t1.getText() + "1");
		}
		else if(e.getSource() == b2) {
			t1.setText(t1.getText() + "2");
		}
		else if(e.getSource() == b3) {
			t1.setText(t1.getText() + "3");
		}
		else if(e.getSource() == b4) {
			t1.setText(t1.getText() + "4");
		}
		else if(e.getSource() == b5) {
			t1.setText(t1.getText() + "5");
		}
		else if(e.getSource() == b6) {
			t1.setText(t1.getText() + "6");
		}
		else if(e.getSource() == b7) {
			t1.setText(t1.getText() + "7");
		}
		else if(e.getSource() == b8) {
			t1.setText(t1.getText() + "8");
		}
		else if(e.getSource() == b9) {
			t1.setText(t1.getText() + "9");
		}
		else if(e.getSource() == b10) {
			t1.setText(t1.getText() + "0");
		}
		else if(e.getSource() == b11) {
			t1.setText(t1.getText() + " + ");
		}
		else if(e.getSource() == b12) {
			t1.setText(t1.getText() + " - ");
		}
		else if(e.getSource() == b13) {
			t1.setText(t1.getText() + " * ");
		}
		else if(e.getSource() == b14) {
			t1.setText(t1.getText() + " / ");
		}
	}
}
