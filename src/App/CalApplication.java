package App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class CalApplication {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	
	String operator;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalApplication window = new CalApplication();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmCalculator.setBounds(100, 100, 324, 503);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(12, 35, 280, 48);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		//------------Row 1-------------------------------------------//
		JButton btnDel = new JButton("<-");
		btnDel.setBackground(UIManager.getColor("Button.background"));
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder stb=new StringBuilder(textField.getText());
					stb.deleteCharAt(textField.getText().length()-1);
					backSpace=stb.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnDel.setBounds(12, 96, 69, 62);
		frmCalculator.getContentPane().add(btnDel);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnClear.setBounds(83, 96, 69, 62);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnMod.setBounds(153, 96, 69, 62);
		frmCalculator.getContentPane().add(btnMod);
		
		JButton btnPLusorMinus = new JButton("+-");
		btnPLusorMinus.setForeground(Color.DARK_GRAY);
		btnPLusorMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops=Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPLusorMinus.setBackground(UIManager.getColor("Button.background"));
		btnPLusorMinus.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPLusorMinus.setBounds(223, 96, 69, 62);
		frmCalculator.getContentPane().add(btnPLusorMinus);
		//------------Row 2------------------------------------------//
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enteredNumber=textField.getText()+btn7.getText();
				textField.setText(enteredNumber);
			}
		});
		btn7.setBounds(12, 160, 69, 62);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber=textField.getText()+btn8.getText();
				textField.setText(enteredNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn8.setBounds(83, 160, 69, 62);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(UIManager.getColor("Button.background"));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enteredNumber=textField.getText()+btn9.getText();
				textField.setText(enteredNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn9.setBounds(153, 160, 69, 62);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnmultiplication = new JButton("*");
		btnmultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="*";
			}
		});
		btnmultiplication.setBackground(UIManager.getColor("Button.background"));
		btnmultiplication.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnmultiplication.setBounds(223, 160, 69, 62);
		frmCalculator.getContentPane().add(btnmultiplication);
		
		
		
		
		//------------Row 3------------------------------------------//
				JButton btn4 = new JButton("4");
				btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String enteredNumber=textField.getText()+btn4.getText();
						textField.setText(enteredNumber);
					}
				});
				btn4.setBounds(12, 224, 69, 62);
				frmCalculator.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String enteredNumber=textField.getText()+btn5.getText();
						textField.setText(enteredNumber);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
				btn5.setBounds(83, 224, 69, 62);
				frmCalculator.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String enteredNumber=textField.getText()+btn6.getText();
						textField.setText(enteredNumber);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
				btn6.setBounds(153, 224, 69, 62);
				frmCalculator.getContentPane().add(btn6);
				
				JButton btnMinus = new JButton("-");
				btnMinus.setForeground(Color.DARK_GRAY);
				btnMinus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstNum=Double.parseDouble(textField.getText());
						textField.setText("");
						operator="-";
					}
				});
				btnMinus.setBackground(UIManager.getColor("Button.background"));
				btnMinus.setFont(new Font("Tahoma", Font.BOLD, 24));
				btnMinus.setBounds(223, 224, 69, 62);
				frmCalculator.getContentPane().add(btnMinus);
				
				
				//------------Row 4-------------------------------------------//
				JButton btn1 = new JButton("1");
				btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String enteredNumber=textField.getText()+btn1.getText();
						textField.setText(enteredNumber);
					}
				});
				btn1.setBounds(12, 288, 69, 62);
				frmCalculator.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String enteredNumber=textField.getText()+btn2.getText();
						textField.setText(enteredNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
				btn2.setBounds(83, 288, 69, 62);
				frmCalculator.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String enteredNumber=textField.getText()+btn3.getText();
						textField.setText(enteredNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
				btn3.setBounds(153, 288, 69, 62);
				frmCalculator.getContentPane().add(btn3);
				
				JButton btnPLus = new JButton("+");
				btnPLus.setForeground(Color.DARK_GRAY);
				btnPLus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstNum=Double.parseDouble(textField.getText());
						textField.setText("");
						operator="+";
					}
				});
				btnPLus.setBackground(UIManager.getColor("Button.background"));
				btnPLus.setFont(new Font("Tahoma", Font.BOLD, 24));
				btnPLus.setBounds(223, 288, 69, 62);
				frmCalculator.getContentPane().add(btnPLus);
				
				

				//------------Row 5-------------------------------------------//
				JButton btn0 = new JButton("0");
				btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String enteredNumber=textField.getText()+btn0.getText();
						textField.setText(enteredNumber);
					}
					
				});
				btn0.setBounds(12, 352, 69, 62);
				frmCalculator.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				/*
				 * String enteredNumber=textField.getText()+btnDot.getText();
				 * textField.setText(enteredNumber);
				 */
						
						if(! textField.getText().contains("."))
				          {
							textField.setText(textField.getText() + btnDot.getText());
				          }
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 24));
				btnDot.setBounds(83, 352, 69, 62);
				frmCalculator.getContentPane().add(btnDot);
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstNum=Double.parseDouble(textField.getText());
						textField.setText("");
						operator="/";
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 24));
				btnDiv.setBounds(153, 352, 69, 62);
				frmCalculator.getContentPane().add(btnDiv);
				
				JButton btnEquals = new JButton("=");
				btnEquals.setForeground(Color.DARK_GRAY);
				btnEquals.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						secondNum=Double.parseDouble(textField.getText());
						
						if(operator=="+")
						{
							result=firstNum+secondNum;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operator=="-")
						{
							result=firstNum-secondNum;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operator=="*")
						{
							result=firstNum*secondNum;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
						else if(operator=="%")
						{
							result=firstNum%secondNum;
							answer=String.format("%.2f", result);
							textField.setText(answer);
						}
					}
				});
				btnEquals.setBackground(UIManager.getColor("Button.background"));
				btnEquals.setFont(new Font("Tahoma", Font.BOLD, 24));
				btnEquals.setBounds(223, 352, 69, 62);
				frmCalculator.getContentPane().add(btnEquals);
				
		
		
		
	}
}
