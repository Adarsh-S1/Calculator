import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {
JFrame jf;
boolean OpClicked=false;
JLabel displayLabel;
JButton sevenButton,clearButton,eightButton,nineButton,fourButton,fiveButton,threeButton,oneButton,twoButton,sixButton,zeroButton,pointButton,mulButton,divButton,plusButton,minusButton,equalsButton;
String oldValue,newValue;
float result,oldValueF,newValueF;
char select;
public Calculator() {
	jf=new JFrame("CALCULATOR");
	jf.setLayout(null);
    jf.setSize(550, 600);
    jf.setLocation(400, 150);
	jf.getContentPane().setBackground(Color.lightGray);
	displayLabel=new JLabel("");
	displayLabel.setBounds(16,50,500,60);
	displayLabel.setBackground(Color.white);
	displayLabel.setOpaque(true);
	displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displayLabel.setForeground(Color.black);
	displayLabel.setFont(new Font("Arial",Font.ITALIC,30));
	jf.add(displayLabel);
	sevenButton=new JButton("7");
	sevenButton.setBounds(30,130,80,80);
	jf.add(sevenButton);
	sevenButton.addActionListener(this);
	sevenButton.setFont(new Font("Arial",Font.BOLD,40));
	
	eightButton=new JButton("8");
	eightButton.setBounds(130,130,80,80);
	jf.add(eightButton);
	eightButton.addActionListener(this);
	eightButton.setFont(new Font("Arial",Font.BOLD,40));
	
	nineButton=new JButton("9");
	nineButton.setBounds(230,130,80,80);
	jf.add(nineButton);
	nineButton.addActionListener(this);
	nineButton.setFont(new Font("Arial",Font.BOLD,40));
	
	fourButton=new JButton("4");
	fourButton.setBounds(230,230,80,80);
	jf.add(fourButton);
	fourButton.addActionListener(this);
	fourButton.setFont(new Font("Arial",Font.BOLD,40));
	
	fiveButton=new JButton("5");
	fiveButton.setBounds(130,230,80,80);
	jf.add(fiveButton);
	fiveButton.addActionListener(this);
	fiveButton.setFont(new Font("Arial",Font.BOLD,40));
	
	sixButton=new JButton("6");
	sixButton.setBounds(30,230,80,80);
	jf.add(sixButton);
	sixButton.addActionListener(this);
	sixButton.setFont(new Font("Arial",Font.BOLD,40));
	
	oneButton=new JButton("1");
	oneButton.setBounds(30,330,80,80);
	jf.add(oneButton);
	oneButton.addActionListener(this);
	oneButton.setFont(new Font("Arial",Font.BOLD,40));
	
	
	twoButton=new JButton("2");
	twoButton.setBounds(130,330,80,80);
	jf.add(twoButton);
	twoButton.addActionListener(this);
	twoButton.setFont(new Font("Arial",Font.BOLD,40));
	
	threeButton=new JButton("3");
	threeButton.setBounds(230,330,80,80);
	jf.add(threeButton);
	threeButton.addActionListener(this);
	threeButton.setFont(new Font("Arial",Font.BOLD,40));
	
	pointButton=new JButton(".");
	pointButton.setBounds(30,430,80,80);
	jf.add(pointButton);
	pointButton.addActionListener(this);
	pointButton.setFont(new Font("Arial",Font.BOLD,40));
	
	zeroButton=new JButton("0");
	zeroButton.setBounds(130,430,80,80);
	jf.add(zeroButton);
	zeroButton.addActionListener(this);
	zeroButton.setFont(new Font("Arial",Font.BOLD,40));
	
	equalsButton=new JButton("=");
	equalsButton.setBounds(230,430,80,80);
	jf.add(equalsButton);
	equalsButton.addActionListener(this);
	equalsButton.setFont(new Font("Arial",Font.BOLD,40));
	
	divButton=new JButton("/");
	divButton.setBounds(330,130,80,80);
	jf.add(divButton);
	divButton.addActionListener(this);
	divButton.setFont(new Font("Arial",Font.BOLD,40));
	
	mulButton=new JButton("x");
	mulButton.setBounds(330,230,80,80);
	jf.add(mulButton);
	mulButton.addActionListener(this);
	mulButton.setFont(new Font("Arial",Font.BOLD,40));
	
	minusButton=new JButton("-");
	minusButton.setBounds(330,330,80,80);
	jf.add(minusButton);
	minusButton.addActionListener(this);
	minusButton.setFont(new Font("Arial",Font.BOLD,40));
	
	plusButton=new JButton("+");
	plusButton.setBounds(330,430,80,80);
	jf.add(plusButton);
	plusButton.addActionListener(this);
	plusButton.setFont(new Font("Arial",Font.BOLD,40));
	
	clearButton=new JButton("C");
	clearButton.setBounds(430,130,80,80);
	jf.add(clearButton);
	clearButton.addActionListener(this);
	clearButton.setFont(new Font("Arial",Font.BOLD,40));
	
jf.setVisible(true);
	
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	new Calculator();
}
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource()==sevenButton)
		{
			if (OpClicked==true) {
				displayLabel.setText("7");	
				OpClicked=false;
			}
			else {
		  displayLabel.setText(displayLabel.getText()+"7");	
			}
		}
		else if (e.getSource()==eightButton)
		{if (OpClicked==true) {
			displayLabel.setText("8");	
			OpClicked=false;
		}
		else {
	  displayLabel.setText(displayLabel.getText()+"8");	
		}
		}
		else if (e.getSource()==nineButton)
		{
			if (OpClicked==true) {
				displayLabel.setText("9");	
				OpClicked=false;
			}
			else {
		  displayLabel.setText(displayLabel.getText()+"9");	
			}
		}
		else if (e.getSource()==sixButton)
		{
			if (OpClicked==true) {
				displayLabel.setText("6");	
				OpClicked=false;
			}
			else {
		  displayLabel.setText(displayLabel.getText()+"6");	
			}		}
		else if (e.getSource()==fiveButton)
		{
			if (OpClicked==true) {
				displayLabel.setText("5");	
				OpClicked=false;
			}
			else {
		  displayLabel.setText(displayLabel.getText()+"5");	
			}		}
		else if (e.getSource()==fourButton)
		{
			if (OpClicked==true) {
				displayLabel.setText("4");	
				OpClicked=false;
			}
			else {
		  displayLabel.setText(displayLabel.getText()+"4");	
			}		}
		else if (e.getSource()==threeButton)
		{
			if (OpClicked==true) {
				displayLabel.setText("3");	
				OpClicked=false;
			}
			else {
		  displayLabel.setText(displayLabel.getText()+"3");	
			}		}
		
		else if (e.getSource()==twoButton)
		{
			if (OpClicked==true) {
				displayLabel.setText("2");	
				OpClicked=false;
			}
			else {
		  displayLabel.setText(displayLabel.getText()+"2");	
			}		}
		else if (e.getSource()==oneButton)
		{
			if (OpClicked==true) {
				displayLabel.setText("1");
				OpClicked=false;
			}
			else {
		  displayLabel.setText(displayLabel.getText()+"1");	
			}
		}
		else if (e.getSource()==zeroButton)
		{
			if (OpClicked==true) {
				displayLabel.setText("0");	
				OpClicked=false;
			}
			else {
		  displayLabel.setText(displayLabel.getText()+"0");	
			}
		}
		else if (e.getSource()==pointButton)
		{
			if (OpClicked==true) {
				displayLabel.setText(".");	
				OpClicked=false;
			}else {
		  displayLabel.setText(displayLabel.getText()+".");	
			}

		}
		else if (e.getSource()==plusButton)
		{ 
			select='a';
		 	OpClicked=true;
		 	oldValue=displayLabel.getText();
		}
		else if (e.getSource()==minusButton)
		{
			select='b';
			OpClicked=true;
		 	oldValue=displayLabel.getText();
		}
		  else if (e.getSource()==mulButton)
			{
			  select='c';
			  OpClicked=true;
			 	oldValue=displayLabel.getText();
			}
		  else if (e.getSource()==divButton)
			{
			  select='d';
			  OpClicked=true;
			 	oldValue=displayLabel.getText();
			  	
			}
	
		  else if (e.getSource()==equalsButton)
			{
			 
			  if (select=='a') {
			  	newValue=displayLabel.getText();	
			  	oldValueF=Float.parseFloat(oldValue);
			   newValueF=Float.parseFloat(newValue);
			  	result=oldValueF+newValueF;
			  	displayLabel.setText(result+"");
			  }
			  if (select=='b') {
				  	newValue=displayLabel.getText();	
				  	oldValueF=Float.parseFloat(oldValue);
				   newValueF=Float.parseFloat(newValue);
				  	result=oldValueF-newValueF;
				  	displayLabel.setText(result+"");
				  }
			  if (select=='c') {
				  	newValue=displayLabel.getText();	
				  	oldValueF=Float.parseFloat(oldValue);
				   newValueF=Float.parseFloat(newValue);
				  	result=oldValueF*newValueF;
				  	displayLabel.setText(result+"");
				  }
			  if (select=='d') {
				  	newValue=displayLabel.getText();	
				  	oldValueF=Float.parseFloat(oldValue);
				   newValueF=Float.parseFloat(newValue);
				  	result=oldValueF/newValueF;
				  	displayLabel.setText(result+"");
				  }
			  }
			
			
		  else if (e.getSource()==clearButton)
			{
			  displayLabel.setText("");	
			}
		
		}
		
			
	}



