import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame{
	
	//Create text fields for print the number
	private JTextField jtfScreen = new JTextField("0");
	
	//Create buttons 0~9
	private JButton jbtZero = new JButton("0");
	private JButton jbtOne = new JButton("1");
	private JButton jbtTwo = new JButton("2");
	private JButton jbtThree = new JButton("3");
	
	private JButton jbtFour = new JButton("4");
	private JButton jbtFive = new JButton("5");
	private JButton jbtSix = new JButton("6");
	
	private JButton jbtSeven = new JButton("7");
	private JButton jbtEight = new JButton("8");
	private JButton jbtNine = new JButton("9");
	
	//Create buttons +, -, *, /, ., =, C, ^, %, ON
	private JButton jbtPlus = new JButton("+");
	private JButton jbtMinus = new JButton("-");
	private JButton jbtMultiply = new JButton("*");
	private JButton jbtExcept = new JButton("/");
	
	private JButton jbtPoint = new JButton(".");
	private JButton jbtEqual = new JButton("=");
	
	private JButton jbtClean = new JButton("C");
	private JButton jbtSqrt = new JButton("^");
	private JButton jbtPercent = new JButton("%");
	private JButton jbtOn = new JButton("ON");
	
	public Calculator() {
		//Panel p1 to hold the text field 
		JPanel p1 = new JPanel(new BorderLayout());
		jtfScreen.setEditable(false);
		jtfScreen.setHorizontalAlignment(JTextField.RIGHT);
		p1.add(jtfScreen);
		
		//Panel p2 to hold buttons
		JPanel p2 = new JPanel(new GridLayout(5, 4));
		p2.add(jbtOn);
		p2.add(jbtClean);
		p2.add(jbtSqrt);
		p2.add(jbtPercent);
		
		p2.add(jbtSeven);
		p2.add(jbtEight);
		p2.add(jbtNine);
		p2.add(jbtPlus);
		
		p2.add(jbtFour);
		p2.add(jbtFive);
		p2.add(jbtSix);
		p2.add(jbtMinus);
		
		p2.add(jbtOne);
		p2.add(jbtTwo);
		p2.add(jbtThree);
		p2.add(jbtMultiply);
		
		p2.add(jbtZero);
		p2.add(jbtPoint);
		p2.add(jbtEqual);
		p2.add(jbtExcept);
		
		//Add the panels to the frame
		getContentPane().add(p1, BorderLayout.NORTH);
		getContentPane().add(p2, BorderLayout.CENTER);
		
		// Register listener
	    jbtOne.addActionListener(new ButtonListener());
	    jbtTwo.addActionListener(new ButtonListener());
	    jbtThree.addActionListener(new ButtonListener());
	    jbtFour.addActionListener(new ButtonListener());
	    jbtFive.addActionListener(new ButtonListener());
	    
	    jbtSix.addActionListener(new ButtonListener());
	    jbtSeven.addActionListener(new ButtonListener());
	    jbtEight.addActionListener(new ButtonListener());
	    jbtNine.addActionListener(new ButtonListener());
	    jbtZero.addActionListener(new ButtonListener());
	    
	    jbtPlus.addActionListener(new ButtonListener());
	    jbtMinus.addActionListener(new ButtonListener());
	    jbtMultiply.addActionListener(new ButtonListener());
	    jbtExcept.addActionListener(new ButtonListener());
	    jbtPoint.addActionListener(new ButtonListener());
	    
	    jbtClean.addActionListener(new ButtonListener());
	    jbtSqrt.addActionListener(new ButtonListener());
	    jbtPercent.addActionListener(new ButtonListener());
	    jbtEqual.addActionListener(new ButtonListener());
	    jbtOn.addActionListener(new ButtonListener());
	    
	}
	
	String output = "";
	String operator = "";
	boolean CanSign = true;
	boolean CanPoint = true;
	double number1 = 0;
	double number2 = 0;
	int lastsign = 0;
	
	/**Handle the Compute buttons*/
	private class ButtonListener implements ActionListener{
		@Override/**Implement actionPerformed*/
		public void actionPerformed(ActionEvent e){
			//Get values from buttons
			if(e.getSource() == jbtOne){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "1";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtTwo){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "2";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtThree){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "3";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtFour){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "4";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtFive){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "5";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtSix){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "6";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtSeven){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "7";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtEight){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "8";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtNine){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "9";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtZero){
				if(jtfScreen.getText().equals("0")){
					output = "";
				}
				output += "0";
				jtfScreen.setText(output);
				CanSign=true;
			}
			else if(e.getSource() == jbtPoint){
				if(CanPoint){
					if(output.equals("")){
						output += "0.";
						jtfScreen.setText(output);
						CanSign=true;
					}
					else{
						output += ".";
						jtfScreen.setText(output);
						CanSign=true;
					}
				CanPoint = false;
				}
			}
			
			else if(e.getSource() == jbtPlus){
				if(CanSign){
					number1 = Double.parseDouble(jtfScreen.getText());
					number2 = operation(lastsign, number1, number2);
					output = "";
					CanSign = false;
					operator = String.valueOf(number2);
					jtfScreen.setText(operator);
				}
				lastsign = 1;
			}
			else if(e.getSource() == jbtMinus){
				if(CanSign){
					number1 = Double.parseDouble(jtfScreen.getText());
					number2 = operation(lastsign, number1, number2);
					output = "";
					CanSign = false;
					operator = String.valueOf(number2);
					jtfScreen.setText(operator);
				}
				lastsign = 2;
			}
			else if(e.getSource() == jbtMultiply){
				if(CanSign){
					number1 = Double.parseDouble(jtfScreen.getText());
					number2 = operation(lastsign, number1, number2);
					output = "";
					CanSign = false;
					operator = String.valueOf(number2);
					jtfScreen.setText(operator);
				}
				lastsign = 3;
			}
			else if(e.getSource() == jbtExcept){
				if(CanSign){
					number1 = Double.parseDouble(jtfScreen.getText());
					number2 = operation(lastsign, number1, number2);
					output = "";
					CanSign = false;
					operator = String.valueOf(number2);
					jtfScreen.setText(operator);
				}
				lastsign = 4;
			}
			else if(e.getSource() == jbtEqual){
					number1 = Double.parseDouble(jtfScreen.getText());
					number2 = operation(lastsign, number1, number2);
					lastsign = 0;
					output = "";
					operator = String.valueOf(number2);
					jtfScreen.setText(operator);
			}
			else if(e.getSource() == jbtClean){
				number1 = 0;
				number2 = 0;
				lastsign = 0;
				output = "";
				CanSign = true;
				CanPoint = true;
				jtfScreen.setText("0");
			}
		}
	}
	/**The method of calculating numbers*/
	public double operation(int sign, double number1, double number2){
		double result = 0;
		
		switch(sign){
		case 0 : result = number1; break;
		case 1 : result = number1 + number2; break;
		case 2 : result = number2 - number1; break;
		case 3 : result = number1 * number2; break;
		case 4 : result = number2 / number1; break;
		}
		
		if(result == -0)
		result = 0;
		CanPoint = true;
		return result;
	}
	
	/**Main method*/
	public static void main(String[] args){
		Password frame = new Password();
		frame.setSize(180, 200);
		frame.setTitle("Security ID");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}
//Create the password class
class Password extends JFrame{
	Calculator frame = new Calculator();
	
	//Create text field and button
	private JTextField jtfPassword = new JTextField();
	private JTextField jtfWrong = new JTextField();
	private JButton jbtOk = new JButton("OK");
	
	public Password(){
		// Panel p1 to hold label, text fields and button
		JPanel p1 = new JPanel(new GridLayout(4, 1));
		p1.add(new JLabel("Enter the password:"));
		p1.add(jtfPassword);
		p1.add(jtfWrong);
		jtfWrong.setEditable(false);
		p1.add(jbtOk);
		
		// Add the panel to the frame
		add(p1, BorderLayout.CENTER);
		
		 // Register listener
	    jbtOk.addActionListener(new ButtonListener());
	}
	
	String password = "0000";
	
	/** Handle the OK button */
	private class ButtonListener implements ActionListener{
		@Override/**Implement actionPerformed*/
		public void actionPerformed(ActionEvent e){
			//The action after you type the password
			if(jtfPassword.getText().equals(password)){
				setVisible(false);
				frame.setSize(250, 300);
				frame.setTitle("CALCULATOR");
				frame.setLocationRelativeTo(null); // Center the frame
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setVisible(true);
			}
			//Type wrong password
			else
				jtfWrong.setText("Please enter again!");
		}
	}
}