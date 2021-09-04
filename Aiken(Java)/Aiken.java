import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
class Aiken extends JFrame implements ActionListener
{
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3,l4,l5,l6;
	String integer;
	Color color;
	Aiken(String s)
	{
		super(s);
		getContentPane().setBackground(Color.decode("#FBF192"));
		Font f1=new Font("SansSerif",Font.BOLD,18);//Font added
		l1=new JLabel("Enter question");
		l1.setFont(f1);
		l2=new JLabel("Enter Option A");
		l2.setFont(f1);
		l3=new JLabel("Enter Option B");
		l3.setFont(f1);
		l4=new JLabel("Enter Option C");
		l4.setFont(f1);
		l5=new JLabel("Enter Option D");
		l5.setFont(f1);
		l6=new JLabel("Enter answer as A/B/C/D");
		l6.setFont(f1);
		t1=new JTextField(16);
		t1.setBackground(Color.decode("#D5E6FE"));
		t1.setFont(f1);
		t2=new JTextField(10);
		t2.setFont(f1);
		t2.setBackground(Color.decode("#D5E6FE"));
		t3=new JTextField(10);
		t3.setFont(f1);
		t3.setBackground(Color.decode("#D5E6FE"));
		t4=new JTextField(10);
		t4.setFont(f1);
		t4.setBackground(Color.decode("#D5E6FE"));
		t5=new JTextField(10);
		t5.setFont(f1);
		t5.setBackground(Color.decode("#D5E6FE"));
		t6=new JTextField(10);
		t6.setFont(f1);
		t6.setBackground(Color.decode("#D5E6FE"));
		b1=new JButton("OK");
		Dimension size=b1.getPreferredSize();
		b2=new JButton("Clear");
		b3=new JButton("Next");
		b4=new JButton("Open");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		setLayout(new GridLayout(0,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(500,600);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton b=(JButton)e.getSource();
		if(b.equals(b1))
		{
			
				
			try{
			File f=new File("Aiken.txt");
			}
			catch(Exception ex){}
			if(t1.getText().isEmpty()||t2.getText().isEmpty()||t3.getText().isEmpty()||t4.getText().isEmpty()||t5.getText().isEmpty()||t6.getText().isEmpty()) //condition added
			{
					JOptionPane.showMessageDialog(null,"Incomplete input values provided.","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
					return;
			}
			else{
				String ans=t6.getText();	
				if(ans.contains("A")||ans.contains("B")||ans.contains("C")||ans.contains("D"))
				{
					 String s=" "+t1.getText()+"\n"+"A. "+t2.getText()+"\n"+"B. "+t3.getText()+"\n"+"C. "+t4.getText()+"\n"+"D. "+t5.getText()+"\n"+"ANSWER: "+t6.getText()+"\n";
				 JOptionPane.showMessageDialog(null,s);
				
				}
				else{
					JOptionPane.showMessageDialog(null,"Wrong option format","Error",JOptionPane.ERROR_MESSAGE); //icon added
					return;
				}
				try{
				FileWriter fl=new FileWriter("Aiken.txt",true);
				fl.write(t1.getText()+"\n"+"A. "+t2.getText()+"\n"+"B. "+t3.getText()+"\n"+"C. "+t4.getText()+"\n"+"D. "+t5.getText()+"\n"+"ANSWER: "+t6.getText()+"\n"+"\n");
				fl.close();
				}
				catch(Exception ex){}
			}
		}
		else if(b==b3)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t1.requestFocus();
		}
		else if(b==b2){
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t1.requestFocus();	
		}
		else{
			if(Desktop.isDesktopSupported())
			{
				try{
					File myfile=new File("Aiken.txt");
					Desktop.getDesktop().open(myfile);
				}
				catch(IOException ex){}
			}
		}	
	}
	public static void main(String []args) throws Exception
	{
		Aiken a=new Aiken("Moodle");
	}
}