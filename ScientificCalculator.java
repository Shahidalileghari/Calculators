package gui.com;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Calculator extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JTextField result;
	JButton one,two,three,four,five,six,seven,eight,nine,ten,zero,add,sub,mult,divide,plusminu,percent,dot,clear,cancel;
	JButton reciprocal,square,cube,power,factorial,sin,sinh,rad,cosine,cosh,sqrt,pi,anyrt,tan,tanh,ee;
	JButton LOG,INLOG,exponent,rand,equal;
	String number,operation,answer;
	double first,second,output;
	public Calculator() {
		super("Scientific Calculator");
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		result=new JTextField();
		result.setBounds(10,5,470,60);
		result.setForeground(Color.blue);
		result.setFont(new Font("tohomo",Font.BOLD,24));
		
		reciprocal=new JButton("r");
		reciprocal.setBounds(10,70,50,40);
		reciprocal.setBackground(Color.black);
		reciprocal.setForeground(Color.white);
		
		square=new JButton("s");
		square.setBounds(70,70,50,40);
		square.setBackground(Color.black);
		square.setForeground(Color.white);
		
	    cube=new JButton("c");
		cube.setBounds(130,70,50,40);
		cube.setBackground(Color.black);
	    cube.setForeground(Color.white);
		
		power=new JButton("p");
		power.setBounds(190,70,50,40);
		power.setBackground(Color.black);
		power.setForeground(Color.white);
		
		clear=new JButton("c");
		clear.setBounds(250,70,50,40);
		clear.setForeground(Color.white);
		clear.setBackground(Color.gray);
		
		cancel=new JButton("x");
	    cancel.setBounds(310,70,50,40);
	    cancel.setForeground(Color.white);
	    cancel.setBackground(Color.gray);
	    
	    plusminu=new JButton("+/-");
		plusminu.setBounds(370,70,50,40);
		plusminu.setForeground(Color.white);
		plusminu.setBackground(Color.gray);
		
		divide=new JButton("/");
		divide.setBounds(430,70,50,40);
		divide.setForeground(Color.white);
		divide.setBackground(Color.gray);
		
	    factorial=new JButton("f");
		factorial.setBounds(10,120,50,40);
		factorial.setBackground(Color.black);
		factorial.setForeground(Color.white);
		
		sin=new JButton("sn");
	    sin.setBounds(10,170,50,40);
	    sin.setBackground(Color.black);
		sin.setForeground(Color.white);
		
		sinh=new JButton("sh");
		sinh.setBounds(10,220,50,40);
		sinh.setBackground(Color.black);
		sinh.setForeground(Color.white);
		
		rad=new JButton("rd");
		rad.setBounds(10,270,50,40);
		rad.setBackground(Color.black);
		rad.setForeground(Color.white);
		
		
		    sqrt=new JButton("st");
		    sqrt.setBounds(70,120,50,40);
		    sqrt.setBackground(Color.black);
		    sqrt.setForeground(Color.white);
			
			cosine=new JButton("cn");
			cosine.setBounds(70,170,50,40);
			cosine.setBackground(Color.black);
			cosine.setForeground(Color.white);
			
			cosh=new JButton("ch");
			cosh.setBounds(70,220,50,40);
			cosh.setBackground(Color.black);
			cosh.setForeground(Color.white);
			
			pi=new JButton("pi");
			pi.setBounds(70,270,50,40);
			pi.setBackground(Color.black);
			pi.setForeground(Color.white);
			
			anyrt=new JButton("at");
		    anyrt.setBounds(130,120,50,40);
		    anyrt.setBackground(Color.black);
			anyrt.setForeground(Color.white);
			
			
			tan=new JButton("tn");
			tan.setBounds(130,170,50,40);
			tan.setBackground(Color.black);
			tan.setForeground(Color.white);
			
			tanh=new JButton("th");
			tanh.setBounds(130,220,50,40);
			tanh.setBackground(Color.black);
			tanh.setForeground(Color.white);
			
			ee=new JButton("ee");
			ee.setBounds(130,270,50,40);
			ee.setBackground(Color.black);
			ee.setForeground(Color.white);
			
			LOG=new JButton("lg");
		    LOG.setBounds(190,120,50,40);
		    LOG.setBackground(Color.black);
			LOG.setForeground(Color.white);
			
			INLOG=new JButton("In");
			INLOG.setBounds(190,170,50,40);
			INLOG.setBackground(Color.black);
			INLOG.setForeground(Color.white);
			
			exponent=new JButton("e");
			exponent.setBounds(190,220,50,40);
			exponent.setBackground(Color.black);
			exponent.setForeground(Color.white);
			
			rand=new JButton("rn");
			rand.setBounds(190,270,50,40);
			rand.setBackground(Color.black);
			rand.setForeground(Color.white);
			
			seven=new JButton("7");
		    seven.setBounds(250,120,50,40);
		    seven.setBackground(Color.black);
			seven.setForeground(Color.white);
			
			four=new JButton("4");
			four.setBounds(250,170,50,40);
			four.setBackground(Color.black);
		    four.setForeground(Color.white);
			
			one=new JButton("1");
			one.setBounds(250,220,50,40);
			one.setBackground(Color.black);
			one.setForeground(Color.white);
			
			percent=new JButton("%");
			percent.setBounds(250,270,50,40);
			percent.setBackground(Color.black);
			percent.setForeground(Color.white);
			
			eight=new JButton("8");
		    eight.setBounds(310,120,50,40);
		    eight.setBackground(Color.black);
			eight.setForeground(Color.white);
			
			five=new JButton("5");
			five.setBounds(310,170,50,40);
			five.setBackground(Color.black);
			five.setForeground(Color.white);
			
			two=new JButton("2");
			two.setBounds(310,220,50,40);
			two.setBackground(Color.black);
			two.setForeground(Color.white);
			
			zero=new JButton("0");
			zero.setBounds(310,270,50,40);
			zero.setBackground(Color.black);
			zero.setForeground(Color.white);
			
			nine=new JButton("9");
		    nine.setBounds(370,120,50,40);
		    nine.setBackground(Color.black);
			nine.setForeground(Color.white);
			
		    six=new JButton("6");
			six.setBounds(370,170,50,40);
			six.setBackground(Color.black);
			six.setForeground(Color.white);
			
			three=new JButton("3");
			three.setBounds(370,220,50,40);
			three.setBackground(Color.black);
			three.setForeground(Color.white);
			
			dot=new JButton(".");
			dot.setBounds(370,270,50,40);
			dot.setBackground(Color.black);
			dot.setForeground(Color.white);
			
			
			mult=new JButton("*");
		    mult.setBounds(430,120,50,40);
		    mult.setForeground(Color.white);
		    mult.setBackground(Color.gray);
		    
		    sub=new JButton("-");
			sub.setBounds(430,170,50,40);
			sub.setForeground(Color.white);
			sub.setBackground(Color.gray);
			
			add=new JButton("+");
			add.setBounds(430,220,50,40);
			add.setForeground(Color.white);
			add.setBackground(Color.gray);
			
			
			equal=new JButton("=");
			equal.setBounds(430,270,50,40);
			equal.setForeground(Color.white);
			equal.setBackground(Color.blue);
			
			 // First ten button fron 1 to zero
			
			one.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					number=result.getText()+one.getText();
					result.setText(number);
					
				}
			});
			
            two.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					number=result.getText()+two.getText();
					result.setText(number);
					
				}
			});
            
            three.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					number=result.getText()+three.getText();
					result.setText(number);
					
				}
			});
            
             four.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					number=result.getText()+four.getText();
					result.setText(number);
					
				}
			});
             
            five.addActionListener(new ActionListener() {
 				
 				@Override
 				public void actionPerformed(ActionEvent e) {
 					number=result.getText()+five.getText();
					result.setText(number);
 					
 				}
 			});
            
            six.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					number=result.getText()+six.getText();
					result.setText(number);
					
				}
			});
            
          seven.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					number=result.getText()+seven.getText();
					result.setText(number);
					
				}
			});
          
          eight.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					number=result.getText()+eight.getText();
					result.setText(number);
					
				}
			});
          
         nine.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					number=result.getText()+nine.getText();
					result.setText(number);
					
				}
			});
         
         zero.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					number=result.getText()+zero.getText();
					result.setText(number);
					
				}
			});
         
         // fundamentals operation or symbols
         
         mult.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					first=Double.parseDouble(result.getText());
					result.setText("");
					operation="*";
					
				}
			});
         
        divide.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 first=Double.parseDouble(result.getText());
						result.setText("");
						operation="/";
					
				}
			});
        
      sub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(result.getText());
				result.setText("");
				operation="-";
				
			}
		});
      
      add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(result.getText());
				result.setText("");
				
				operation="+";
				
			}
		});
      
      // plusminus and dot and percent
      
      dot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
      
      percent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
      
     plusminu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double x=Double.parseDouble(String.valueOf(result.getText()));
				
				x=x*(-1);
				
				result.setText(String.valueOf(x));
				
			}
		});
     // cancel and clear button
     cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int lenth=result.getText().length();
				int number=result.getText().length()-1;
				String store;
				
				if(lenth>0)
				{
					StringBuffer back=new StringBuffer(result.getText());
					back.deleteCharAt(number);
					
					store=back.toString();
					
					result.setText(store);
				}
				
			}
		});
     
   clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				
			}
		});
        
   power.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		first=Double.parseDouble(result.getText());
		result.setText("");
		
		operation="p";
		
		
	}
});
   
   LOG.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			
			operation="lg";
			
		}
	});
   
  INLOG.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="In";
			
		}
	});
   exponent.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="e";
			
		}
	});
    rand.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
   
   
   cube.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			
			operation="c";
		}
	});
   
   anyrt.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			
			operation="at";
			
		}
	});
   
   tan.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="tn";
			
		}
	});
   tanh.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="th";
			
		}
	});
   
   ee.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
   
   
   square.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			
			operation="s";
			
		}
	});
   
   
   sqrt.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			
			operation="st";
		}
	});
   
   cosine.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="cn";
			
		}
	});
   cosh.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="ch";
			
		}
	});
   
   pi.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="pi";
			
		}
	});
    
   reciprocal.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			
			operation="r";
		}
	});
   factorial.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="f";
		}
	});
   sin.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="sn";
			
		}
	});
   sinh.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(result.getText());
			result.setText("");
			operation="sh";
			
		}
	});
   rad.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
   // All operation are performed here in equal button
   equal.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		second=Double.parseDouble(result.getText());
		String s=String.valueOf(second);
		result.setText(s);
		
		switch(operation)
		{
		case "+":output=first+second;
		
		answer=String.format("%.2f", output);
		
		result.setText(answer); 
		break;
        case "-":output=first-second;
		
		answer=String.format("%.2f", output);
		
		result.setText(answer); 
		break;
		
	  case "*": output=first*second;
	
	  answer=String.format("%.2f", output);
	
	  result.setText(answer); 
	   break;
	  case "/": output=first/second;
		
	  answer=String.format("%.2f", output);
	
	  result.setText(answer); 
	   break;
	 case "p":
	  output=Math.pow(first, second);     
     answer=String.format("%.2f", output);
	 result.setText(answer);
	 break;
	 case "at":
			output=Math.pow(first, 1/second);
			 answer=String.format("%.2f",output);		
			result.setText(answer);
	  break;
		}
			
		
	}
});
   
   equal.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(operation) {
	  case "c":
		   output=Math.pow(first, 3);     
			answer=String.format("%.2f", output);
			result.setText(answer);
		   break;
		  case "r":
		 output=Math.pow(first, -1);     
		answer=String.format("%.2f", output);
		result.setText(answer);
		break;
		  case "s":
	   output=Math.pow(first, 2);    
	    answer=String.format("%.2f",output);		
		result.setText(answer);
			   break;
		  case "f":
			output=factorial((int) first);
			  answer=String.format("%.2f",output);		
				result.setText(answer);
			  break;
			  
		  case "st":
				output=Math.sqrt(first);
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;
		  case "lg":	  
			  output=log2((int) first);
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				break;
		  case "sn":
			  output=Math.sin(first);
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;  
		  case "cn":
			  output=Math.cos(first);
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;
				  
		  case "tn":
			  output=Math.tan(first);
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;
		  case "In":
			  output=Math.exp(Math.log(first));
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;		  
		  case "sh":
			  output=Math.asin(first);
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;
		  case "ch":
			  output=Math.acos(first);
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;
		  case "th":
			  output=Math.atan(first);
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;	
		  case "e":
			  output=Math.exp(first);
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;
		  case "pi":
			  output=Math.PI;
				 answer=String.format("%.2f",output);		
				result.setText(answer);
				  break;		  
		}
	}
});
   
			
		add(mult);	
		add(sub);
		add(add);
		add(equal);
		add(nine);	
		add(six);
		add(three);
		add(dot);
		add(eight);
		add(five);
		add(two);
		add(zero);
		add(seven);
		add(four);
		add(one);
		add(percent);
		add(LOG);
		add(INLOG);
		add(exponent);
		add(rand);
		add(anyrt);
		add(tan);
		add(tanh);
		add(ee);
		add(sqrt);
		add(cosh);
		add(cosine);
		add(pi);
		add(factorial);
		add(sin);
		add(sinh);
		add(rad);
		add(square);
        add(cube);
        add(power);
        add(clear);
        add(cancel);
        add(plusminu);
        add(divide);
		add(reciprocal);
		add(result);
		
	    setLocation(100,80);
		setSize(505,360);
		setVisible(true);
	}
	int  factorial(int n)
	   {  
		  
		  if (n == 0)    
			    return 1;    
			  else    
			    return(n * factorial(n-1));    
			 
		  
	   }
	 public static double log2(int x) {
	        return Math.log(x) / Math.log(2);
	    }
}

public class ScientificCalculator {

	public static void main(String[] args) {
		
      new Calculator();
	}

}
