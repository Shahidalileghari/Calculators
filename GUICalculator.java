 package gui.com;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;

class Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton one,two,three,four,five,six,plusminus,seven,eight,nine,zero,dot,add,sub,mult,divide,cancel,clear,percent,equal;
	JTextField text;
	
	double first,second;
	double result;
	String   answer,number;
	String operation;
	
	 public Calculator() {

		 
		 super("CALCULATOR");
		setLayout(null);
		getContentPane().setBackground(Color.yellow);
		text=new JTextField();
		text.setBounds(15,15,262,50);
		text.setFont(new Font("tohomo",Font.BOLD,20));
		text.setForeground(Color.BLUE);
		
		divide=new JButton("/");
		divide.setBounds(215,70,60,50);
		divide.setFont(new Font("tohomo",Font.BOLD,30));
		divide.setBackground(Color.gray);
		divide.setForeground(Color.white);
		
		mult=new JButton("*");
		mult.setBounds(215,125,60,50);
		mult.setFont(new Font("tohomo",Font.BOLD,30));
		mult.setBackground(Color.gray);
		mult.setForeground(Color.white);
		
		sub=new JButton("-");
		sub.setBounds(215,181,60,50);
		sub.setFont(new Font("tohomo",Font.BOLD,30));
		sub.setBackground(Color.gray);
		sub.setForeground(Color.white);
		
		add=new JButton("+");
		add.setBounds(215,238,60,50);
		add.setFont(new Font("tohomo",Font.BOLD,30));
		add.setBackground(Color.gray);
		add.setForeground(Color.white);
		
		equal=new JButton("=");
		equal.setBounds(215,295,60,50);
		equal.setFont(new Font("tohomo",Font.BOLD,20));
		equal.setBackground(Color.blue);
		equal.setForeground(Color.white);
		
		plusminus=new JButton("+/-");
		plusminus.setBounds(147,70,60,50);
		plusminus.setFont(new Font("tohomo",Font.BOLD,20));
		plusminus.setBackground(Color.gray);
		plusminus.setForeground(Color.white);
		
		nine=new JButton("9");
		nine.setBounds(147,125,60,50);
		nine.setFont(new Font("tohomo",Font.BOLD,20));
    	nine.setBackground(Color.black);
		nine.setForeground(Color.white);
		
		six=new JButton("6");
		six.setBounds(147,181,60,50);
		six.setFont(new Font("tohomo",Font.BOLD,20));
		six.setBackground(Color.black);
		six.setForeground(Color.white);
		
		three=new JButton("3");
		three.setBounds(147,238,60,50);
		three.setFont(new Font("tohomo",Font.BOLD,20));
		three.setBackground(Color.black);
		three.setForeground(Color.white);
		
		dot=new JButton(".");
		dot.setBounds(147,295,60,50);
		dot.setFont(new Font("tohomo",Font.BOLD,30));
	    dot.setBackground(Color.black);
		dot.setForeground(Color.white);
		
		cancel=new JButton("\uF0E7");
		cancel.setBounds(80,70,60,50);
		cancel.setFont(new Font("tohomo",Font.BOLD,20));
		cancel.setBackground(Color.gray);
		cancel.setForeground(Color.white);
		
		clear=new JButton("AC");
		clear.setBounds(15,70,60,50);
		clear.setFont(new Font("tohomo",Font.BOLD,12));
		clear.setBackground(Color.gray);
		clear.setForeground(Color.white);
		
		seven=new JButton("7");
		seven.setBounds(15,125,60,50);
		seven.setFont(new Font("tohomo",Font.BOLD,20));
		seven.setBackground(Color.black);
		seven.setForeground(Color.white);
		
		four=new JButton("4");
		four.setBounds(15,181,60,50);
		four.setFont(new Font("tohomo",Font.BOLD,20));
		four.setBackground(Color.black);
		four.setForeground(Color.white);
		
		one=new JButton("1");
		one.setBounds(15,238,60,50);
		one.setFont(new Font("tohomo",Font.BOLD,20));
		one.setBackground(Color.black);
		one.setForeground(Color.white);
		
		percent=new JButton("%");
		percent.setBounds(15,295,60,50);
		percent.setFont(new Font("tohomo",Font.BOLD,20));
		percent.setBackground(Color.black);
		percent.setForeground(Color.white);
		
		eight=new JButton("8");
		eight.setBounds(80,125,60,50);
		eight.setFont(new Font("tohomo",Font.BOLD,20));
		eight.setBackground(Color.black);
		eight.setForeground(Color.white);
		
		five=new JButton("5");
		five.setBounds(80,181,60,50);
		five.setFont(new Font("tohomo",Font.BOLD,20));
		five.setBackground(Color.black);
		five.setForeground(Color.white);
		
		two=new JButton("2");
		two.setBounds(80,238,60,50);
		two.setFont(new Font("tohomo",Font.BOLD,20));
		two.setBackground(Color.black);
		two.setForeground(Color.white);
		
		zero=new JButton("0");
		zero.setBounds(80,295,60,50);
		zero.setFont(new Font("tohomo",Font.BOLD,20));
		zero.setBackground(Color.black);
		zero.setForeground(Color.white);
		
		
		equal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				second=Double.parseDouble(text.getText());
				String s=String.valueOf(second);
				text.setText(s);
				
				if(operation=="+")
				
				{
					result=first+second;
					answer=String.format("%.2f", result);
					
					text.setText(answer);
				}
				
				else	 if(operation=="-"){
					result=first-second;
					answer=String.format("%.2f", result);
					
					text.setText(answer);
				}  
				
				 else if(operation=="*")
				 {
					result=first*second;
					answer=String.format("%.2f", result);
					
					text.setText(answer);
				}
				
				
				 else 
				 {
					result=first/second;
					answer=String.format("%.2f", result);
					
					text.setText(answer);
				}
					
				
				
				
				
			}
		});
		one.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				

				number=text.getText()+one.getText();
				
				text.setText(number);
			}
		});
		
        two.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
                number=text.getText()+two.getText();
				
				text.setText(number);
				
			}
		});
three.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
                number=text.getText()+three.getText();
                		;
				
				text.setText(number);
				
			}
		});
four.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		number=text.getText()+four.getText();
		
		text.setText(number);
		
	}
});
five.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		number=text.getText()+five.getText();
				;
		
		text.setText(number);
		
	}
});
six.addActionListener(new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		number=text.getText()+six.getText();
		
		text.setText(number);
		
	}
});
seven.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		number=text.getText()+seven.getText();
		
		text.setText(number);
		
	}
});

eight.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		number=text.getText()+eight.getText();
		
		text.setText(number);
		
	}
});

nine.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		number = text.getText()+nine.getText();
		
		text.setText(number);
		
	}
});

zero.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		number=text.getText()+zero.getText();
		
		text.setText(number);
		
	}
});

clear.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		text.setText(null);
		
	}
});

divide.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	//	text.setText(text.getText()+"/");
		
		
       first=Double.parseDouble(text.getText());
		text.setText("");
		operation="/";
	}
});

mult.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	//	text.setText(text.getText()+"*");
		
       first=Double.parseDouble(text.getText());
		text.setText("");
		operation="*";
		
	}
});
sub.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	//	text.setText(text.getText()+"-");
        first=Double.parseDouble(text.getText());
      //  text.setText(text.getText()+"-");
        text.setText("");
		operation="-";
		
	}
});

add.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		first=Double.parseDouble(text.getText());
		//text.setText(text.getText()+"+");
		
		text.setText("+");
		operation="+";
		
	}
});

plusminus.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		double result=Double.parseDouble(String.valueOf(text.getText()));
		
		result=result*(-1);
		
		text.setText(String.valueOf(result));
		
		
	}
});
dot.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		text.setText(text.getText()+".");
		
	}
});

percent.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		text.setText(text.getText()+"%");
		
	}
});

cancel.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int lenth=text.getText().length();
		int number=text.getText().length()-1;
		String store;
		
		if(lenth>0)
		{
			StringBuffer back=new StringBuffer(text.getText());
			back.deleteCharAt(number);
			
			store=back.toString();
			
			text.setText(store);
		}
		
	}
});

   

		add(eight);
		add(zero);
		add(two);
		add(five);
		add(seven);
		add(four);
		add(one);
		add(percent);
		add(clear);
		
		add(cancel);
		
		add(plusminus);
		add(nine);
		add(three);
		add(six);
		add(dot);
		add(add);
        add(equal);
		add(sub);
		add(mult);
		add(divide);
		add(text);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(307,410);
		setLocation(200,140);
	}
	 

}
public class GUICalculator {

	public static void main(String[] args) {
		new Calculator();
	}

}


