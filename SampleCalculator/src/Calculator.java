import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calculator implements ActionListener{
	boolean isOperatorClicked=false;
	    String oldValue,newValue;
        JFrame jf;
        JLabel displayLabel;
        JButton sevenButton;
        JButton eightButton;
        JButton nineButton;
        JButton fourButton;
        JButton fiveButton;
        JButton threeButton;
        JButton sixButton;
        JButton oneButton;
        JButton twoButton,clearButton;
        JButton zeroButton,minusButton,dotButton,equalButton,plusButton,divButton,mulButton;
        
        
	public Calculator() {
		
	    jf=new JFrame("                                                    Calculator ");
		jf.setSize(600,600);
	
		jf.setLayout(null);
		jf.setLocation(300, 150);
		
	    displayLabel=new JLabel();
	    displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setBounds(30,20, 540, 100);
		displayLabel.setBackground(Color.gray);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130, 80, 80);
		sevenButton.setFont(new Font("Arial", Font.BOLD, 38));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		
		eightButton=new JButton("8");
		eightButton.setBounds(130,130, 80, 80);
		eightButton.setFont(new Font("Arial", Font.BOLD, 38));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
	    nineButton=new JButton("9");
		nineButton.setBounds(230,130, 80, 80);
		nineButton.setFont(new Font("Arial", Font.BOLD, 38));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,230, 80, 80);
		fourButton.setFont(new Font("Arial", Font.BOLD, 38));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
	    fiveButton=new JButton("5");
		fiveButton.setBounds(130,230, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.BOLD, 38));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
	    sixButton=new JButton("6");
		sixButton.setBounds(230,230, 80, 80);
		sixButton.setFont(new Font("Arial", Font.BOLD, 38));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
	    oneButton=new JButton("1");
		oneButton.setBounds(30,330, 80, 80);
		oneButton.setFont(new Font("Arial", Font.BOLD, 38));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
	    twoButton=new JButton("2");
		twoButton.setBounds(130,330, 80, 80);
		twoButton.setFont(new Font("Arial", Font.BOLD, 38));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
	    threeButton=new JButton("3");
		threeButton.setBounds(230,330, 80, 80);
		threeButton.setFont(new Font("Arial", Font.BOLD, 38));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		zeroButton=new JButton("0");
   	    zeroButton.setBounds(130,430, 80, 80);
	 	zeroButton.setFont(new Font("Arial", Font.BOLD, 38));
	 	zeroButton.addActionListener(this);
		jf.add(zeroButton);
			
		
		dotButton=new JButton(".");
		dotButton.setBounds(30,430, 80, 80);
		dotButton.setFont(new Font("Arial", Font.BOLD, 38));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
	  
	    equalButton=new JButton("=");
		equalButton.setBounds(230,430, 80, 80);
		equalButton.setFont(new Font("Arial", Font.BOLD, 38));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330,130, 100, 80);
		divButton.setFont(new Font("Arial", Font.BOLD, 38));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330,230, 100, 80);
		plusButton.setFont(new Font("Arial", Font.BOLD, 38));
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330,330, 100, 80);
		minusButton.setFont(new Font("Arial", Font.BOLD, 38));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		mulButton=new JButton("*");
		mulButton.setBounds(330,430, 100, 80);
		mulButton.setFont(new Font("Arial", Font.BOLD, 38));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(440,430, 120, 80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
	  new Calculator();
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}

			
		}else if(e.getSource()== eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}

			
		}else if(e.getSource()== nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()== fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()== fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()== sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
			
		}else if(e.getSource()== threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}	
			
			
		}else if(e.getSource()== twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()== oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()== zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		
		}else if(e.getSource()== dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
			
			
			
			
		}else if(e.getSource()== equalButton) {
			
		    newValue=displayLabel.getText();

			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			float resulst=oldValueF + newValueF;
			displayLabel.setText(resulst+"");
			
			
			float resulta=oldValueF * newValueF;
			displayLabel.setText(resulta+"");
			
			
			float resultb=oldValueF / newValueF;
			displayLabel.setText(resultb+"");
			
			
			float resultc=oldValueF - newValueF;
			displayLabel.setText(resultc+"");
			
			
			
		}else if(e.getSource()==divButton) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
			
        }else if(e.getSource()== plusButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
			
			
			
		}else if(e.getSource()== mulButton) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
		
			
		}else if(e.getSource()== minusButton){
		
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		
			
			
		}else if(e.getSource()== clearButton) {
			displayLabel.setText(" ");
		}
		
		
	}
	
}


